

/* Main for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 27 April 2021
 * Controls the flow of the game
 */



import java.io.InputStream;
import java.util.Scanner;
import java.util.Random;
public class Main {

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

    public String getPlayerColor(InputStream in) {
        Color color = new Color();
        Scanner scanner = new Scanner(System.in);
        String choice = null;
        System.out.println("would you like to be green or blue");
        String co = scanner.nextLine();
        co = co.toUpperCase();
        if(co.equals("GREEN")){
            choice = Color.GREEN;
            return choice;
        } else if(co.equals("BLUE")){
            choice = Color.BLUE;
        }
        return choice;
    }

    public String getCompColor(){
        Color color = new Color();
        String def;
        String choice = getPlayerColor(System.in);
        if(choice.equals(Color.GREEN)){
            def = Color.BLUE;
        }else{
            def = Color.GREEN;
        }
        return def;
    }

    public static void main(String[] args) {
        Player game = new Player();
        game.game();
    }

}
