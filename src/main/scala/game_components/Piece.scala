package game_components

//******* PIECE *******
class Piece (playerOwner: String = "undefined", pieceId: Int = 0) {


  def show = {
    var result : String = playerOwner + pieceId
    result
  }
} 