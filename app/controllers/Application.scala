package controllers

import models._
import play.api._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

class Application extends Controller {

  def tweetParse(tweet: String) : String = {
    /*
      Check out stackexchange:
      http://stackoverflow.com/questions/20171305/multi-hashtag-system-in-scala-with-play-framework
     */

    val hashTagPattern = """#(\w+)""".r
    val textWithLinks: String = hashTagPattern.replaceAllIn(tweet, { m =>
      val hashTag = m.group(1)
      s"""<a href="/tag/$hashTag">#$hashTag</a>"""
    })
    textWithLinks
  }

  def tweetGetTags(tweet: String) : Iterator[String] = {
    val hashTagPattern = """#(\w+)""".r
    hashTagPattern.findAllIn(tweet).map(x => x.slice(1, x.length))
  }

  def index = Action {
    Ok(views.html.index("Hello World."))
  }

  def index2(tag: String) = Action {
    Ok(views.html.index2(tag))
  }

  val messageForm: Form[Message] = Form {
    mapping(
      "tweet" -> text
    )(Message.apply)(Message.unapply)
  }

  def getMyTag(tag: String): List[String] = {
    val rez = DBmessage.query[Hashtag]
      .whereEqual("hashtag", tag)
      .fetch().toList
    rez.map(x => tweetParse(x.tweet))
  }

  def getMessages = Action {
    val messages = DBmessage.query[Message].order("id", true).limit(10).fetch()
    val otags = messages.map { x =>
                  x.tags.flatMap( y =>
                    getMyTag(y)).toList}.toList
    val t = messages.map(x => x.tweet).toList zip otags
    Ok(Json.toJson(t.map(x => Display(tweetParse(x._1), x._2.map(x => x.mkString)))))
  }

  def getHashtags = Action {
    val hashtags = DBmessage.query[Hashtag]
      .order("id",true)
      .limit(10)
      .fetch()
    Ok(Json.toJson(hashtags))
  }

  def getHashtag(tag: String) = Action {
    val hashtags = DBmessage.query[Hashtag]
      .whereEqual("hashtag", tag)
      .order("id",true)
      .limit(10)
      .fetch()
    Ok(Json.toJson(hashtags.map(x => Map("tweet" -> tweetParse(x.tweet)) )))
  }

  def addMessage = Action { implicit request =>
    val message = messageForm.bindFromRequest.get
    DBmessage.save(message)

    val htags = tweetGetTags(message.tweet)
    val tmptags = htags.map(x => Hashtag(x, message.tweet))
    tmptags.foreach(DBmessage.save(_))

    Redirect(routes.Application.index())
  }


}
