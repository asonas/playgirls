package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.Idea

object Application extends Controller {

  val ideaForm = Form(
    "label" -> nonEmptyText
  )

  def index = Action {
    Ok("Hello world")
  }

  def ideas = Action {
    Ok(views.html.index(Idea.all(), ideaForm))
  }

  def create = TODO

  def deleteIdea = TODO
}
