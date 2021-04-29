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
    public void game(){
        main getName = new main();
        String compName = getName.compName();
        String playerName = getName.playerName();
        System.out.println("you are going up against " + compName);
        System.out.println( "Welcome " + playerName
                + " and " + compName + ". Please enjoy your game.");

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        int compValue = deck.getCompValue();
        int playerValue = deck.getPlayerValue();
        //this will have the computer randomly choose if it wants a card or not
        int compChoice = random.nextInt(2);


        boolean loop = false;
        while(!loop){
            try{
                System.out.println("It is now " + playerName + "'s turn to go");
                System.out.println("would you like to hit or stay");
                String playerChoice = input.nextLine();
                playerChoice = playerChoice.toUpperCase();

                loop = true;
                if(playerChoice.equals("HIT")){
                    playerValue = playerValue + deck.playerGetNewCard();
                    System.out.println("would you like to hit again");
                    String again = input.nextLine();
                    if (again.equals("HIT")){
                        playerValue = playerValue + deck.playerGetNewCard();
                        System.out.println("would you like to hit again");
                        String again2 = input.nextLine();
                        if(again2.equals("HIT")){
                                playerValue = playerValue + deck.playerGetNewCard();
                                if(playerValue > 21){
                                    System.out.println("you lose");
                                    break;
                                }
                        }
                        if(playerValue > 21){
                            System.out.println("you lose");
                            break;
                        }
                    }
                    if (playerValue > 21){
                        System.out.println("you lose");
                        break;
                    }
                }else if(playerChoice.equals("STAY")){
                    System.out.println("it is now " + compName + "'s turn to go");
                }else{
                    System.out.println("Your input was invalid...");
                    loop = false;
                }
            }catch(InputMismatchException e) {
                System.out.println("please try again:");
            }
        }
        if(compChoice == 1){
            compValue = compValue + deck.compGetNewCard();
        }
        else{
            System.out.println("the computer has chose not to hit it is now your turn");
            loop = false;
        }
        System.out.println("goodbye");

    }

    private String name;
    private int playersCard;

}
