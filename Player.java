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
            String hitAgain;
            //this will have the computer randomly choose if it wants a card or not
            int compHitAgain = random.nextInt(2);
            int compHitAgain2 = random.nextInt(2);
            int compChoice = random.nextInt(2);
            System.out.println(choice + "It is now " + playerName + "'s turn to go");
            System.out.println("would you like to hit or stay");
            String playerChoice = input.nextLine();
            playerChoice = playerChoice.toUpperCase();
            if (playerChoice.equals("HIT")) {
                do {
                    playerValue = playerValue + deck.playerGetNewCard();
                    System.out.println("would you like to hit again (yes or no):");
                    hitAgain = input.nextLine();
                    hitAgain = hitAgain.toUpperCase();
                    if (!hitAgain.equals("NO")) {
                        System.out.println("your input was invalid computer is breaking by default:");
                    } else{
                        break;
                    }
                    break;
                }while(hitAgain.equals("YES"));
            } else if (playerChoice.equals("STAY")) {
                System.out.println("you have chosen to stay:" + Color.RESET);
                continue;
            }
            if(compAgain > 1){
                System.out.println(compDefault +"the computer chose to hit again.");
            }
            compAgain++;
            if (compAgain < 1){
                System.out.println(compDefault + "it is now " + compName + "'s turn to go");
            }
            if (compChoice == 1) {
                do {
                    compValue = compValue + deck.compGetNewCard();
                    compHitAgain++;
                    compHitAgain2++;
                }while(compHitAgain != 1 || compHitAgain2 != 1);
            } else {
                System.out.println("the computer has chose to stay" + Color.RESET);
            }
            if(compValue > 21 && playerValue > 21){
                System.out.println("its a tie you both lose");
            }else if(compValue == 21){
                System.out.println("the computer won");
            } else if(playerValue == 21){
                System.out.println("you won");
            }else if(playerValue ){
                
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
