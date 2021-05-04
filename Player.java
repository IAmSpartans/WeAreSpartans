/* player for BlackJack
 * Matthew W. Gavin R. Caleb
 * 4 April 2021
 * controls player moves and other things
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {

    public void game() {
        int compAgain = 0;
        Main main = new Main();
        String choice = main.getPlayerColor();
        String compDefault = main.getCompColor();
        String againAgain = "VOID";

        Main getName = new Main();
        String compName = getName.compName();
        String playerName = getName.playerName();
        System.out.println("you are going up against " + compName);
        System.out.println("Welcome " + playerName
               + " and " + compName + ". Please enjoy your game.");
        do {
            Random random = new Random();
            Scanner input = new Scanner(System.in);
            Deck deck = new Deck();
            int compValue = deck.getCompValue();
            int playerValue = deck.getPlayerValue();
            //this will have the computer randomly choose if it wants a card or not
            int compChoice = random.nextInt(2);

            boolean turn = false;
            boolean loop = false;
            while (!loop) {
                if (!turn) {
                    System.out.println(choice + "It is now " + playerName + "'s turn to go");
                    System.out.println("would you like to hit or stay");
                    String playerChoice = input.nextLine();
                    playerChoice = playerChoice.toUpperCase();
                    String again = "VOID";
                    loop = true;
                    if (playerChoice.equals("HIT")) {
                        do {
                            playerValue = playerValue + deck.playerGetNewCard();
                            if (playerValue > 21) {
                                System.out.println("you lose, you went over 21");
                            } else if (playerValue < 21) {
                                System.out.println("would you like to hit again or Stay");
                                again = input.nextLine();
                                again = again.toUpperCase();
                            } else if (playerValue == 21) {
                                System.out.println("you won.");
                                break;
                            } else if (playerChoice.equals("STAY")) {
                                break;
                            } else {
                                System.out.println("Your input was invalid...");
                                loop = false;
                            }
                        } while (again.equals("HIT"));
                    } else if (playerChoice.equals("STAY")) {
                        continue;
                    }
                } else if (turn){
                    do{
                        if(compAgain > 1){
                            System.out.println("the computer chose to hit again.");
                        }
                        compAgain++;
                        if (compAgain < 1){
                            System.out.println(compDefault + "it is now " + compName + "'s turn to go");
                        }
                        if (compChoice == 1) {
                            compValue = compValue + deck.compGetNewCard();
                            if (compValue == 21) {
                                System.out.println("the computer won");
                                break;
                            } else if (compValue > 21) {
                                System.out.println("you won the computer went over 21");
                                break;
                            }
                        } else {
                            System.out.println("the computer has chose not to hit");
                            loop = false;
                        }
                    }while(loop);
                }
                turn = !turn;
            }
            System.out.println("the game is over would you like to play again?(yes or no)");
            againAgain = input.nextLine();
            againAgain = againAgain.toUpperCase();
            if (againAgain.equals("NO")) {
                System.out.println("goodbye");
            }
        } while (againAgain.equals("YES")) ;
    }
}
