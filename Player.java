/* Printing players for BlackJack
 * Matthew W. Gavin R. Caleb Sean C.
 * 26 April 2021
 * Where I keep the information about each player
 * where the game is run
 */
import java.util.Random;
import java.util.Scanner;
public class Player {

    int playerBet;
    void bet() {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to bet 10, 50, or 100 dollars:");
        do {
            playerBet = input.nextInt();
            if (playerBet != 10 && playerBet != 50 && playerBet != 100) {
                System.out.println("your input was invalid pleas try again:");
            } else {
                break;
            }
        } while (playerBet != 10 && playerBet != 50 && playerBet != 100);
    }
    int compBetValue;
    void compBet() {
        Random random = new Random();
        int get = random.nextInt(3);
        int[] values = {10, 50, 100};
        this.compBetValue = values[get];
        System.out.println("the computer has chosen to bet $" + compBetValue);
    }
    int compFinalValue = 500;
    int amountOFMoney = getFromFile();

    //get comp name in main function as a global variable then pass it in
    //this way the compName doesn't get called every time so it is static
    //add arguments to game to get all information
    //add information in main class in ru function
    public void game(String choice, String playerName, String compName) {
        Main getInformation = new Main();
        saveToFile();
        int bet = playerBet;
        int compBet = compBetValue;
        int compAgain = 0;
        String compDefault = getInformation.getCompColor();
        System.out.println("you are going up against " + compName);
        System.out.println("Welcome " + playerName
                + " and " + compName + ". Please enjoy your game.");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        String hitAgain;
        boolean compHitAgain;
        int compValue = deck.getCompValue();
        int playerValue = deck.getPlayerValue();
        int compChoice = random.nextInt(2);
        System.out.println(choice + "It is now " + playerName + "'s turn to go");
        System.out.println("would you like to hit or stay");
        String playerChoice = input.nextLine();
        playerChoice = playerChoice.toUpperCase();
        if (playerChoice.equals("HIT")) {
            do {
                playerValue = playerValue + deck.playerGetNewCard();
                System.out.println("would you like to hit again (hit or stay):");
                hitAgain = input.nextLine();
                hitAgain = hitAgain.toUpperCase();
                switch (hitAgain) {
                    case "STAY" -> System.out.println("you have chosen to stay:");
                    case "HIT" -> System.out.println("you have chosen to hit");
                    default -> System.out.println("your input was invalid it is the next players turn by default");
                }
            } while (hitAgain.equals("HIT"));
        } else if (playerChoice.equals("STAY")) {
            System.out.println("you have chosen to stay:" + Colors.RESET);
        }
        if (compChoice == 1) {
            do {
                if (compAgain > 1) {
                    System.out.println(compDefault + compName + " chose to hit again.");
                }
                if (compAgain < 1) {
                    System.out.println(compDefault + "it is now " + compName + "'s turn to go");
                    System.out.println(compName + " chose to hit" + Colors.RESET);
                }
                compValue = compValue + deck.compGetNewCard();
                compAgain++;
                compHitAgain = compValue < 15;
                if (!compHitAgain) {
                    System.out.println(compDefault + compName + " chose to stay:" + Colors.RESET);
                }
            } while (compHitAgain);
        } else {
            System.out.println(compName + " chose to stay" + Colors.RESET);
        }
        if (playerValue > 21 && compValue < 21) {
            System.out.println("you went over 21 " + compName + " won by default");
            compFinalValue = bet + compFinalValue;
            amountOFMoney = amountOFMoney - bet;
        } else if (compValue > 21 && playerValue < 21) {
            System.out.println(compName + " went over 21 you won by default");
            amountOFMoney = amountOFMoney + compBet;
            compFinalValue = compFinalValue - compBet;
        } else if (playerValue == compValue && playerValue <= 21) {
            //this does not need to say compValue <= 21 because that is implied;
            System.out.println("it's a tie");
        } else if (compValue > playerValue && compValue <= 21) {
            System.out.println(compName + " won");
            compFinalValue = bet + compFinalValue;
            amountOFMoney = amountOFMoney - bet;
        } else if (playerValue > compValue && playerValue <= 21) {
            System.out.println("you won");
            amountOFMoney = amountOFMoney + compBet;
            compFinalValue = compFinalValue - compBet;
        } else {
            System.out.println("an error has occurred");
        }
        System.out.println("with a final score of " + playerValue + " to " + compValue);
        System.out.println("you now have $" + amountOFMoney + " and " + compName + " has $" + compFinalValue);
        System.out.println("the game is over would you like to play again?(yes or no)");
    }
    void saveToFile() {
        int playerSaveToFile;
        playerSaveToFile = amountOFMoney;
        Main.money.inputScore(playerSaveToFile);
    }
    int getFromFile(){
        int moneyAmount;
        moneyAmount = Main.money.getMoney();
        return moneyAmount;
    }
}
