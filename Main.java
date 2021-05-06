

/* Main for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 27 April 2021
 * Controls the flow of the game
 */



import java.util.Objects;
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
        String[] compName = {"john", "Tim", "samantha", "Papa-tim", "Bob"};
        String players;
        players = compName[getCompName];
        return players;
    }

    String choice;

    public String getPlayerColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to be green or blue");
        String co = scanner.nextLine();
        co = co.toUpperCase();
        if(co.equals("GREEN")){
            choice = Color.GREEN;
        } else if(co.equals("BLUE")){
            this.choice = Color.BLUE;
        }
        return choice;
    }

    public String getCompColor(){
        String def;
        if(Objects.equals(this.choice, Color.GREEN)){
            def = Color.BLUE;
        }else{
            def = Color.GREEN;
        }
        return def;
    }

    public static void main(String[] args) {
        //i need to make so that once both players stay the game ends and it checks who won.
        Player game = new Player();
        game.game();
    }

}
