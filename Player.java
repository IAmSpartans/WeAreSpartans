/* player for BlackJack
 * Matthew W. Gavin R. Caleb
 * 4 April 2021
 * controles player moves and other things
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
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
                System.out.println("would you like to hit or pass");
                String playerChoice = input.nextLine();
                playerChoice = playerChoice.toUpperCase();

                loop = true;
                if(playerChoice.equals("HIT")){
                    playerValue = playerValue + deck.playerGetNewCard();
                    if (playerValue > 21){
                        System.out.println("you lose");
                    }
                }else if(playerChoice.equals("PASS")){

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

    }


    private String name;
    private int playersCard;

    public Player(String n, int player) {
        setName(n, player);
    }

    public Player() {

    }

    public void setName(String n, int player) {
        name = n;
        playersCard = player;

    }

}
