
/* Main for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 27 April 2021
 * Controls the flow of the game
 */



import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        String[] players = new String[2];
        int current;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to BlackJack\n" + "What is the name of the first player? ");
        players[0] = input.nextLine();
        System.out.print( "What is the name of the second player? ");
        players[1] = input.nextLine();
        System.out.println( "Welcome " + players[0]
                + " and " + players[1] + ". Please enjoy your game.");
        current = 0;
        Player game = new Player();
        game.game();
        boolean loop = true;
        int playerIndex = 0;
        do {
            System.out.println("It is now time for " + players[current] + " to make a move");

            if (playerIndex == 0) loop = false;
            else playerIndex--;
        } while (loop);
    }
}
