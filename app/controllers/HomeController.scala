package controllers

import javax.inject._

import models.{DB, Person, UpdatePerson}
import play.api._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._
import sorm.Persisted

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {
    Ok(views.html.index("Abida - Play Application"))
  }

  val personForm: Form[Person] = Form {
    mapping(
      "name" -> text
    )(Person.apply)(Person.unapply)
  }

  val updateForm: Form[UpdatePerson] = Form {
    mapping(
      "name" -> text,
      "update" -> text
    )(UpdatePerson.apply)(UpdatePerson.unapply)
  }

  def addPerson = Action { implicit request =>
    val person = personForm.bindFromRequest.get
    DB.save(person)
    Redirect(routes.HomeController.index())
  }

  def getPersons = Action {

    val persons = DB.query[Person].fetch
    Ok(Json.toJson(persons))
  }

  def listPersons = Action {
    val persons = DB.query[Person].fetch
    Ok(Json.toJson(persons))
  }

  def updatePerson = Action {
    implicit request =>

      val input = updateForm.bindFromRequest.get

      val findp = DB.query[Person]
        .whereEqual("name", input.name)
        .fetchOne()

      val output = findp.map(a => a.copy(name = input.update)).map(a => DB.save(a))

      Redirect(routes.HomeController.index)
  }

  def deletePerson = Action {
    implicit request =>

      val input = personForm.bindFromRequest.get

      val output = DB.query[Person]
        .whereEqual("name", input.name)
        .fetchOne()

      output.map(a => DB.delete(a))

      Redirect(routes.HomeController.index)
  }

}
