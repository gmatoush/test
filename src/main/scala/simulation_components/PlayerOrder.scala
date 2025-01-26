package simulation_components

import game_components.Player

//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {

  // Initialize the queue with the original players
  this += new Player("Red")
  this += new Player("Blue")
  this += new Player("Yellow")
  this += new Player("Green")

  def advance: Unit = {
    // Dequeue the first player and add them back to the end of the queue
    this += this.dequeue
  }

  def show: String = {
    // Build the string representation of the queue
    val sb = new StringBuilder("")
    sb ++= PlayerOrder.map(_.getName).mkString(", ")
    sb.toString
  }

  def current: Player = {
    // Grabs the current player from the queue
    this.head
  }

  def reset: Unit = {
    // Clear the queue
    this.clear()

    // Re-add the original players in the initial order
    this += new Player("Red")
    this += new Player("Blue")
    this += new Player("Yellow")
    this += new Player("Green")
  }
}