package simulation_components

//******* TURN *******
object Turn {


    def show = {
        val currentPlayer = PlayerOrder.current.getName
        val currentPlayerUpper = currentPlayer.map(_.toUpper)

        val result = " CURRENT TURN: " + currentPlayerUpper + "\n"
        result
    }
}