package models

case class Idea(id: Long, label: String)

object Idea {

  def all(): List[Idea] = Nil

  def create(label: String) {}

  def delete(id: Long) {}

}
