/* Main for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 27 April 2021
 * Controls the flow of the game
 */
import java.util.Objects;
import java.util.Scanner;
public class Main {
    Scanner input = new Scanner(System.in);
    public static String player;
    public static Money money;
    public void playerName(){
        System.out.print("Welcome to BlackJack\n" + "What is the name of the first player? ");
        player = input.next();
        money = new Money(player);
    }
    String choice;
    public String getPlayerColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like your color to be green or blue");
        String co = scanner.nextLine();
        co = co.toUpperCase();
        if(co.equals("GREEN")){
            choice = Colors.GREEN;
        } else if(co.equals("BLUE")){
            this.choice = Colors.BLUE;
        }
        return choice;
    }
    public String getCompColor(){
        String def;
        if(Objects.equals(this.choice, Colors.GREEN)){
            def = Colors.BLUE;
        }else{
            def = Colors.GREEN;
        }
        return def;
    }
    void run(){
        //things to fix:
        //things run twice or more when they are not supposed to
        Player game = new Player();
        Main main = new Main();
        CompName botName = new CompName();
        String compName = botName.getComputerName();
        Scanner scanner = new Scanner(System.in);
        String choice;
        String colorChoice = main.getPlayerColor();
        do{
            money.getMoney();
            game.bet();
            game.compBet();
            game.game(colorChoice, player, compName);
            choice = scanner.nextLine();
            choice = choice.toUpperCase();
            if (!choice.equals("YES")) System.out.println("goodbye");
        }while(choice.equals("YES"));
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.getCompColor();
        main.playerName();
        main.run();
    }
}
