/* Printing players for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 26 April 2021
 * Where I keep the information about each player
 * Where the player makes moves
 */

import java.util.InputMismatchException;

import java.util.Scanner;

public class Player {
//i know this doesn't do exactly what it supposed to but that's on purpose ill fix it.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        int compValue = deck.getCompValue();
        int playerValue = deck.getPlayerValue();
        //i don't know if these are the correct terms
        boolean loop = false;
        while(!loop){
            try{
                System.out.println("would you like to hit or pass");
                String playerChoice = input.nextLine();
                playerChoice = playerChoice.toUpperCase();

                loop = true;
                if(playerChoice.equals("HIT")){
                    playerValue = playerValue + deck.getNewCard();
                    System.out.println(playerValue);
                }else if(playerChoice.equals("PASS")){

                }else{
                    System.out.println("Your input was invalid...");
                    loop = false;
                }
            }catch(InputMismatchException e){
                System.out.println("please try again:");
            }
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
