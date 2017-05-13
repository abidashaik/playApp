package models

import play.api.libs.json.Json

/**
  * Created by kabeer on 11/05/17.
  */
case class Person(name: String)

case class UpdatePerson(name: String, update: String)

/* serialize class to json format to send it to the client */
object Person {

  implicit val personFormat = Json.format[Person]

}