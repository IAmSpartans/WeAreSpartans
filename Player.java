/* player for BlackJack
 * Matthew W. Gavin R. Caleb
 * 4 April 2021
 * controls player moves and other things
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {



    public static void main(String[] args) {

    }
    public void game() {
        Main main = new Main();
        String choice = main.getPlayerColor(System.in);
        String compDefault = main.getCompColor();
        String againAgain;
        do{
            Main getName = new Main();
            String compName = getName.compName();
            String playerName = getName.playerName();
            System.out.println("you are going up against " + compName);
            System.out.println("Welcome " + playerName
                    + " and " + compName + ". Please enjoy your game.");

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
                if(!turn){
                    turn = true;
                }else if(turn){
                    turn = false;
                }
                if (!turn) {
                    try {
                        System.out.println(choice + "It is now " + playerName + "'s turn to go");
                        System.out.println("would you like to hit or stay");
                        String playerChoice = input.nextLine();
                        playerChoice = playerChoice.toUpperCase();

                        loop = true;
                        if (playerChoice.equals("HIT")) {
                            playerValue = playerValue + deck.playerGetNewCard();
                            if(playerValue > 21){
                                System.out.println("you lose, you went over 21");
                            }else if(playerValue < 21){
                                System.out.println("would you like to hit again");
                                String again = input.nextLine();
                            }
                            else if(playerValue == 21){
                                System.out.println("you won.");
                            }
                        } else if (playerChoice.equals("STAY")) {
                        } else {
                            System.out.println("Your input was invalid...");
                            loop = false;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("please try again:");
                    }
                }else if (turn){
                    System.out.println(compDefault + "it is now " + compName + "'s turn to go");
                    if (compChoice == 1) {
                        compValue = compValue + deck.compGetNewCard();
                        if (compValue == 21){
                            System.out.println("the computer won");
                            break;
                        }else if(compValue > 21) {
                            System.out.println("you won the computer went over 21");
                            break;
                        }
                    } else {
                        System.out.println("the computer has chose not to hit");
                        loop = false;
                    }
                }
            }
            System.out.println("the game is over would you like to play again?(yes or no)");
            againAgain = input.nextLine();
            againAgain = againAgain.toUpperCase();
            if(againAgain.equals("NO")){
                System.out.println("goodbye");
            }
        }while(againAgain.equals("YES"));
    }

}
