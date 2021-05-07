
/* Main for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 27 April 2021
 * Controls the flow of the game
 */



import java.util.Objects;
import java.util.Scanner;

public class Main {

    String players;
    public void playerName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to BlackJack\n" + "What is the name of the first player? ");
        players = input.nextLine();
    }


    String choice;

    public void getPlayerColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like your color to be green or blue");
        String co = scanner.nextLine();
        co = co.toUpperCase();
        if(co.equals("GREEN")){
            choice = Color.GREEN;
        } else if(co.equals("BLUE")){
            this.choice = Color.BLUE;
        }
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

    void run(){
        Player game = new Player();
        Money money = new Money();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do{
            money.getMoney();
            game.bet();
            game.compBet();
            game.game();
            choice = scanner.nextLine();
            choice = choice.toUpperCase();
            if (!choice.equals("YES")) System.out.println("goodbye");
        }while(choice.equals("YES"));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getPlayerColor();
        main.getCompColor();
        main.playerName();
        main.run();
    }

}
