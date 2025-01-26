package simulation_components

import game_components.Dice

//******* TURN *******
object DiceTracker {

    def show = {
        val dice1 = new Dice()
        val dice2 = new Dice()

        // Build the string representation of the queue
        val sb = new StringBuilder("")
        sb ++= " DICE:\n"
        sb ++= " +---+  +---+\n"
        sb ++= " | " + dice1.show + " | " + " | " + dice2.show + " |\n"
        sb ++= " +---+  +---+\n\n"
        sb.toString
    }
}