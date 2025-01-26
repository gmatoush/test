package game_components

//******* HOME *******
class Home(homeOwner: String = "undefined") {

  def show = {
    // Build the string representation of the queue
    val sb = new StringBuilder("")
    sb ++= new Safe().show
    sb ++= new Space().show * 7
    sb ++= homeOwner.capitalize + " HOME"
    sb.toString
  }
}