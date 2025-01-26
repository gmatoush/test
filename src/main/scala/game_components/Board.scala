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

  def show: String = {
    val sb = new StringBuilder("|\n|\nV\n") // Start the board output

    // Loop through exits and corresponding homes
    for (i <- exits.indices) {
      // Add the exit
      sb ++= exits(i).show + "\n"

      // Add 6 empty spaces
      sb ++= (1 to 6).map(_ => "{}").mkString("\n") + "\n"

      // Add a safe space
      sb ++= "{}SAFE\n"

      // Add 4 more spaces
      sb ++= (1 to 4).map(_ => "{}").mkString("\n") + "\n"

      // Add the corresponding home
      sb ++= homes(i).show + "\n"

      // Add 4 more spaces
      sb ++= (1 to 4).map(_ => "{}").mkString("\n") + "\n"
    }

    sb ++= "|\n|\nV\n\n"
    sb.toString
  }
}
