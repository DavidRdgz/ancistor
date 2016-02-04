package models

import play.api.libs.json.Json

/**
  * Created by galois on 1/29/16.
  */

case class Display(tweet: String, otags: List[String])

object Display {
  implicit val hashtagFormat = Json.format[Display]
}