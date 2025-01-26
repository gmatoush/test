package game_components

import scala.collection.mutable

//******* BOARD *******
object Board {
  // Variables storing the exits
  val redExit = new Exit("RED")
  val blueExit = new Exit("BLUE")
  val yellowExit = new Exit("YELLOW")
  val greenExit = new Exit("GREEN")
  val exits = Array(redExit, greenExit, blueExit, yellowExit)

  // Variables storing the homes
  val redHome = new Home("RED")
  val blueHome = new Home("BLUE")
  val yellowHome = new Home("YELLOW")
  val greenHome = new Home("GREEN")
  val homes = Array(greenHome, blueHome, yellowHome, redHome)

  // Array storing the normal spaces on the board
  val normalSpaces = Array.fill(67)(new Space())
  val "\n" = "\n"

  def show: String = {
    val sb = new StringBuilder("\n|\n|\nV\n")

    sb ++= exits(0).show + "\n"
    sb ++= exits(1).show + "\n"
    sb ++= exits(2).show + "\n"
    sb ++= exits(3).show + "\n"
    sb ++= new Safe().show + "\n"
    for (i <- exits.indices) {
      sb ++= exits(i).show + "\n"
      for (_ <- 0 until 6) sb ++= new Space().show + "\n"
      sb ++= new Safe().show + "\n"
      for (_ <- 0 until 4) sb ++= new Space().show + "\n"
      sb ++= homes(3).show + "\n"
      for (_ <- 0 until 4) sb ++= new Space().show + "\n"

    }

    sb ++= "|\n|\nV\n" // Final formatting
    sb.toString
  }
}