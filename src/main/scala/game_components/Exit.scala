package game_components

//******* EXIT *******
class Exit(exitOwner: String = "undefined") {

  def show = {
    val exitOwnerLetter = exitOwner.charAt(0).toUpper

    // Build the string representation
    val sb = new StringBuilder()
    sb ++= new Space().show + exitOwner + " EXIT\n"
    sb ++= "<--|" + exitOwnerLetter.toString * 4 + "|"
    sb.toString
  }
}