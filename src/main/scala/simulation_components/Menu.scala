package simulation_components

import game_components.Board

object Menu {

  def showPlayerOrder: String = {
    PlayerOrder.show
  }

  def advancePlayerOrder: String = {
    // Perform the advancement
    PlayerOrder.advance

    // Show the player order to ensure that it works
    PlayerOrder.show
  }

  def showGameArea: String = {
    PlayerOrder.reset
    val sb = new StringBuilder("")
    sb ++= Board.show
    sb ++= Turn.show
    sb ++= DiceTracker.show
    sb.toString
  }
}
