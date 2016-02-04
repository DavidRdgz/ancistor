package models

import play.api.libs.json.Json

/**
  * Created by galois on 1/23/16.
  */

case class Person(name: String, email: String)

object Person {

  implicit val personFormat = Json.format[Person]


}