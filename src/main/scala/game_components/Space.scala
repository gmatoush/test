package game_components

//******* SPACE *******
class Space {
  val piece: Option[Piece] = None

  def show: String = {
    piece match {
      case Some(p) => p.show
      case None    => "{}"
    }
  }
}