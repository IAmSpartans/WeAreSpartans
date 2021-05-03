/* Main for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 27 April 2021
 * Controls the flow of the game
 */



import java.util.Scanner;
import java.util.Random;
public class main {

    public String playerName(){
        String players;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to BlackJack\n" + "What is the name of the first player? ");
        players = input.nextLine();
        return players;
    }

    public String compName(){
        Random random = new Random();
        int getCompName = random.nextInt(5);
        String[] compName = {"Jack", "Tim", "samantha", "MacGyver", "Bob"};
        String players;
        players = compName[getCompName];
        return players;
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        main call = new main();
        Player game = new Player();
        game.game();
    }
}
