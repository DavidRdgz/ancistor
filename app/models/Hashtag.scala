package models

import play.api.libs.json.Json

/**
  * Created by galois on 1/26/16.
  */

case class Hashtag(hashtag: String, tweet: String)

object Hashtag {
  implicit val hashtagFormat = Json.format[Hashtag]
}
