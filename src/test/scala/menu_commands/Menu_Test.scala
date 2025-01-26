package menu_commands

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._
import simulation_components.Menu

class Menu_Test extends AnyFunSpec with Matchers {
  describe("The Parqués Game Simulation") {
    describe("has a menu") {

      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {     
        val expectedResult = "Red, Blue, Yellow, Green"
        Menu.showPlayerOrder should be(expectedResult)  
      }

      //******* ADVANCE ORDER *******
      it("can advance the player order") {     
        val expectedResult = "Blue, Yellow, Green, Red"
        Menu.advancePlayerOrder should be(expectedResult)  
      }

       //******* SHOW GAME AREA *******
      it("can show the 96 space game board with player jails, homes, exits, safe spaces, and the two dice"){
        val expectedResult = 
          "|\n"+
          "|\n"+
          "V\n"+
          "{}RED EXIT\n"+"<--|RRRR|\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}SAFE\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+   
          "{}SAFE"+"{}{}{}{}{}{}{}GREEN HOME\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}GREEN EXIT\n"+"<--|GGGG|\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}SAFE\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+   
          "{}SAFE"+"{}{}{}{}{}{}{}BLUE HOME\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+         
          "{}BLUE EXIT\n"+"<--|BBBB|\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}SAFE\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+   
          "{}SAFE"+"{}{}{}{}{}{}{}YELLOW HOME\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}YELLOW EXIT\n"+"<--|YYYY|\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}SAFE\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+   
          "{}SAFE"+"{}{}{}{}{}{}{}RED HOME\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "{}\n"+
          "|\n"+
          "|\n"+
          "V\n"+
          "\n CURRENT TURN: RED\n"+
          " DICE:\n"+
          " +---+  +---+\n"+
          " | 0 |  | 0 |\n"+
          " +---+  +---+\n\n"    
        Menu.showGameArea should be(expectedResult)
      }  
    }
  }
}
