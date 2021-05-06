/* player for BlackJack
 * Matthew W. Gavin R. Caleb
 * 4 April 2021
 * controls player moves and other things
 */

import java.util.Random;
import java.util.Scanner;

public class Player {

    public void game() {
        Score score = new Score();
        int compAgain = 0;
        Main main = new Main();
        String choice = main.getPlayerColor();
        String compDefault = main.getCompColor();
        String againAgain;

        Main getName = new Main();
        String compName = CompName.compName();
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
            boolean compHitAgain;
            int compChoice = random.nextInt(2);
            System.out.println(choice + "It is now " + playerName + "'s turn to go");
            System.out.println("would you like to hit or stay");
            String playerChoice = input.nextLine();
            playerChoice = playerChoice.toUpperCase();
            if (playerChoice.equals("HIT")) {
                do {
                    playerValue = playerValue + deck.playerGetNewCard();
                    System.out.println("would you like to hit again (hit or stay):");
                    hitAgain = input.nextLine();
                    hitAgain = hitAgain.toUpperCase();
                    if(hitAgain.equals("STAY")){
                        System.out.println("you have chosen to stay:");
                    }else{
                        System.out.println("your input was invalid it is the next players turn by default");
                    }
                }while(hitAgain.equals("HIT"));
            } else if (playerChoice.equals("STAY")) {
                System.out.println("you have chosen to stay:" + Color.RESET);
            }
            if (compChoice == 1) {
                do {
                    if(compAgain > 1){
                        System.out.println(compDefault + compName + " chose to hit again.");
                    }
                    if (compAgain < 1){
                        System.out.println(compDefault + "it is now " + compName + "'s turn to go");
                        System.out.println(compName + " chose to hit" + Color.RESET);
                    }
                    compValue = compValue + deck.compGetNewCard();
                    compAgain++;
                    compHitAgain = compValue < 15;
                    if(!compHitAgain){
                        System.out.println(compDefault + compName + " chose to stay:" + Color.RESET);
                    }
                }while(compHitAgain);
            } else {
                System.out.println(compName + " chose to stay" + Color.RESET);
            }
            if (playerValue > 21 && compValue < 21){
                System.out.println("you went over 21" + compName + " won by default");
            }else if(compValue > 21 && playerValue < 21){
                System.out.println(compName + " went over 21 you won by default");
            }else if(playerValue == compValue && playerValue <= 21){
                //this does not need to say compValue <= 21 because that is implied;
                System.out.println("it's a tie");
            }else if(compValue > playerValue && compValue <= 21){
                System.out.println(compName + " won");
            }else if(playerValue > compValue && playerValue <= 21){
                System.out.println("you won");
            }else{
                System.out.println("an error has occurred");
            }
            System.out.println("with a final score of " + playerValue + " to " + compValue);
            System.out.println("the game is over would you like to play again?(yes or no)");
            againAgain = input.nextLine();
            againAgain = againAgain.toUpperCase();
            if (againAgain.equals("NO")) {
                System.out.println("goodbye");
            }
        } while (againAgain.equals("YES")) ;
    }
}
