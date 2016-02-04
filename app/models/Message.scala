package models

import play.api.libs.json.Json

/**
  * Created by galois on 1/25/16.
  */

case class Message(tweet: String){
  def tags = tweetGetTags(tweet).toSet

  def tweetGetTags(tweet: String) : Iterator[String] = {
    val hashTagPattern = """#(\w+)""".r
    hashTagPattern.findAllIn(tweet).map(x => x.slice(1, x.length))
  }
}

object Message {
  implicit val messageFormat = Json.format[Message]
}
