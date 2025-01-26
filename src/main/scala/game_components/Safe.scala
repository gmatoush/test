package game_components

//******* SAFE *******
class Safe(playerOwner: String = "undefined") {

    def show: String = new Space().show + "SAFE"
}