
/* Deck for BlackJack
 * Matthew W. Gavin R. Caleb
 * 4 April 2021
 * First Create the 4 suits
 */

import java.util.Scanner;
import java.util.Random;

public class Deck {

    public int playerGetNewCard(){

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int generateSuit3 = random.nextInt(4);

        int generateCard3 = random.nextInt(13);


        //generates two cards randomly for each player

        String[] card = {"Spades", "Diamonds", "Clubs", "Hearts"};

        String[] value = {"Ace of ", "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of "

                , "10 of ", "Jack of ", "Queen of ", "King of "};

        String playerCard1 = value[generateCard3] + card[generateSuit3];
        //shown player value



        int playerValue = 0;

        int aceChoice;
        switch (playerCard1) {
            case "Ace of Spades", "Ace of Diamonds", "Ace of Clubs", "Ace of Hearts" -> {
                System.out.println("would you like to have your ace equal 1 or ll:");
                aceChoice = scanner.nextInt();
                if (aceChoice == 1) {

                    playerValue = 1;

                } else if (aceChoice == 11) {

                    playerValue = 11;

                } else {

                    System.out.println("your input was invalid");

                }
            }
            case "2 of Spades", "2 of Diamonds", "2 of Clubs", "2 of Hearts" -> playerValue = 2;
            case "3 of Spades", "3 of Diamonds", "3 of Clubs", "3 of Hearts" -> playerValue = 3;
            case "4 of Spades", "4 of Diamonds", "4 of Clubs", "4 of Hearts" -> playerValue = 4;
            case "5 of Spades", "5 of Diamonds", "5 of Clubs", "5 of Hearts" -> playerValue = 5;
            case "6 of Spades", "6 of Diamonds", "6 of Clubs", "6 of Hearts" -> playerValue = 6;
            case "7 of Spades", "7 of Diamonds", "7 of Clubs", "7 of Hearts" -> playerValue = 7;
            case "8 of Spades", "8 of Clubs", "8 of Diamonds", "8 of Hearts" -> playerValue = 8;
            case "9 of Spades", "9 of Diamonds", "9 of Clubs", "9 of Hearts" -> playerValue = 9;
            case "10 of Spades", "10 of Hearts", "10 of Diamonds", "10 of Clubs", "Jack of Spades",
                    "Jack of Diamonds", "Jack of Clubs", "Jack of Hearts", "Queen of Spades",
                    "Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "King of Spades",
                    "King of Diamonds", "King of Clubs", "King of Hearts" -> playerValue = 10;
            default -> System.out.println("Error");
            // this will be the value the computer shows;
            //this is one of the players cards;
            // this will help determine if the computer chooses more that 21;
        }


        System.out.println("your new card is the " + playerCard1);

        return playerValue;
    }
    public int compGetNewCard(){


        Random random = new Random();

        int generateSuit3 = random.nextInt(4);

        int generateCard3 = random.nextInt(13);


        //generates two cards randomly for each player

        String[] card = {"Spades", "Diamonds", "Clubs", "Hearts"};

        String[] value = {"Ace of ", "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of "

                , "10 of ", "Jack of ", "Queen of ", "King of "};

        String compCard1 = value[generateCard3] + card[generateSuit3];
        //shown player value



        int compValue = 0;

        int aceChoice = random.nextInt(2);
        switch (compCard1) {
            case "Ace of Spades", "Ace of Diamonds", "Ace of Clubs", "Ace of Hearts" -> {
                if (aceChoice == 1) {

                    compValue = 1;

                } else{

                    compValue = 11;

                }
            }
            case "2 of Spades", "2 of Diamonds", "2 of Clubs", "2 of Hearts" -> compValue = 2;
            case "3 of Spades", "3 of Diamonds", "3 of Clubs", "3 of Hearts" -> compValue = 3;
            case "4 of Spades", "4 of Diamonds", "4 of Clubs", "4 of Hearts" -> compValue = 4;
            case "5 of Spades", "5 of Diamonds", "5 of Clubs", "5 of Hearts" -> compValue = 5;
            case "6 of Spades", "6 of Diamonds", "6 of Clubs", "6 of Hearts" -> compValue = 6;
            case "7 of Spades", "7 of Diamonds", "7 of Clubs", "7 of Hearts" -> compValue = 7;
            case "8 of Spades", "8 of Clubs", "8 of Diamonds", "8 of Hearts" -> compValue = 8;
            case "9 of Spades", "9 of Diamonds", "9 of Clubs", "9 of Hearts" -> compValue = 9;
            case "10 of Spades", "10 of Hearts", "10 of Diamonds", "10 of Clubs", "Jack of Spades",
                    "Jack of Diamonds", "Jack of Clubs", "Jack of Hearts", "Queen of Spades",
                    "Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "King of Spades",
                    "King of Diamonds", "King of Clubs", "King of Hearts" -> compValue = 10;
            default -> System.out.println("Error");
            // this will be the value the computer shows;
            //this is one of the players cards;
            // this will help determine if the computer chooses more that 21;
        }

        System.out.println("the computer chose to hit");

        return compValue;
    }
    private int users;

    private Player[] players;

    private Deck deck;

    public int getPlayerValue(){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int generateSuit3 = random.nextInt(4);

        int generateCard3 = random.nextInt(13);

        int generateSuit4 = random.nextInt(4);

        int generateCard4 = random.nextInt(13);


        //generates two cards randomly for each player

        String[] card = {"Spades", "Diamonds", "Clubs", "Hearts"};

        String[] value = {"Ace of ", "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of "

                , "10 of ", "Jack of ", "Queen of ", "King of "};

        String playerCard1 = value[generateCard3] + card[generateSuit3];
        //shown player value

        String playerCard2Hidden = value[generateCard4] + card[generateSuit4];
        //hidden player value


        int playerValue = 0;
        int playerValueHidden = 0;

        int aceChoice;
        switch (playerCard1) {
            case "Ace of Spades", "Ace of Diamonds", "Ace of Clubs", "Ace of Hearts" -> {
                System.out.println("would you like to have your ace equal 1 or ll:");
                aceChoice = scanner.nextInt();
                if (aceChoice == 1) {

                    playerValue = 1;

                } else if (aceChoice == 11) {

                    playerValue = 11;

                } else {

                    System.out.println("your input was invalid");

                }
            }
            case "2 of Spades", "2 of Diamonds", "2 of Clubs", "2 of Hearts" -> playerValue = 2;
            case "3 of Spades", "3 of Diamonds", "3 of Clubs", "3 of Hearts" -> playerValue = 3;
            case "4 of Spades", "4 of Diamonds", "4 of Clubs", "4 of Hearts" -> playerValue = 4;
            case "5 of Spades", "5 of Diamonds", "5 of Clubs", "5 of Hearts" -> playerValue = 5;
            case "6 of Spades", "6 of Diamonds", "6 of Clubs", "6 of Hearts" -> playerValue = 6;
            case "7 of Spades", "7 of Diamonds", "7 of Clubs", "7 of Hearts" -> playerValue = 7;
            case "8 of Spades", "8 of Clubs", "8 of Diamonds", "8 of Hearts" -> playerValue = 8;
            case "9 of Spades", "9 of Diamonds", "9 of Clubs", "9 of Hearts" -> playerValue = 9;
            case "10 of Spades", "10 of Hearts", "10 of Diamonds", "10 of Clubs", "Jack of Spades",
                    "Jack of Diamonds", "Jack of Clubs", "Jack of Hearts", "Queen of Spades",
                    "Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "King of Spades",
                    "King of Diamonds", "King of Clubs", "King of Hearts" -> playerValue = 10;
            default -> System.out.println("Error");
            // this will be the value the computer shows;
            //this is one of the players cards;
            // this will help determine if the computer chooses more that 21;
        }
        switch (playerCard2Hidden) {
            case "Ace of Spades", "Ace of Diamonds", "Ace of Clubs", "Ace of Hearts" -> {
                System.out.println("would you like to have your ace equal 1 or ll:");
                aceChoice = scanner.nextInt();
                if (aceChoice == 1) {

                    playerValueHidden = 1;

                } else if (aceChoice == 11) {

                    playerValueHidden = 11;

                } else {

                    System.out.println("your input was invalid");

                }
            }
            case "2 of Spades", "2 of Diamonds", "2 of Clubs", "2 of Hearts" -> playerValueHidden = 2;
            case "3 of Spades", "3 of Diamonds", "3 of Clubs", "3 of Hearts" -> playerValueHidden = 3;
            case "4 of Spades", "4 of Diamonds", "4 of Clubs", "4 of Hearts" -> playerValueHidden = 4;
            case "5 of Spades", "5 of Diamonds", "5 of Clubs", "5 of Hearts" -> playerValueHidden = 5;
            case "6 of Spades", "6 of Diamonds", "6 of Clubs", "6 of Hearts" -> playerValueHidden = 6;
            case "7 of Spades", "7 of Diamonds", "7 of Clubs", "7 of Hearts" -> playerValueHidden = 7;
            case "8 of Spades", "8 of Clubs", "8 of Diamonds", "8 of Hearts" -> playerValueHidden = 8;
            case "9 of Spades", "9 of Diamonds", "9 of Clubs", "9 of Hearts" -> playerValueHidden = 9;
            case "10 of Spades", "10 of Hearts", "10 of Diamonds", "10 of Clubs", "Jack of Spades",
                    "Jack of Diamonds", "Jack of Clubs", "Jack of Hearts", "Queen of Spades",
                    "Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "King of Spades",
                    "King of Diamonds", "King of Clubs", "King of Hearts" -> playerValueHidden = 10;
            default -> System.out.println("Error");
            // this will be the value the computer does not show;
            //this is one of the players cards;
            // this will help determine if the computer chooses more that 21;
        }
        //creates total value for comp and player
        //this is to remain hidden

        System.out.println("you have the " + playerCard2Hidden + " and the " + playerCard1);


        final int playerAddedValue = playerValue + playerValueHidden;

        return playerAddedValue;
    }

    public int getCompValue(){
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int generateSuit = random.nextInt(4);

        int generateCard = random.nextInt(13);

        int generateSuit2 = random.nextInt(4);

        int generateCard2 = random.nextInt(13);


        //generates two cards randomly for each player

        String[] card = {"Spades", "Diamonds", "Clubs", "Hearts"};

        String[] value = {"Ace of ", "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of "

                , "10 of ", "Jack of ", "Queen of ", "King of "};

        String compCard1 = value[generateCard] + card[generateSuit];
        //showed computer value

        String compCard2Hidden = value[generateCard2] + card[generateSuit2];
        //hidden computer value

        int compValue = 0;
        int compValueHidden = 0;

        int aceChoice;


        switch (compCard1) {
            case "Ace of Spades", "Ace of Diamonds", "Ace of Clubs", "Ace of Hearts" -> {
                System.out.println("would you like to have your ace equal 1 or ll:");
                aceChoice = scanner.nextInt();
                if (aceChoice == 1) {

                    compValue = 1;

                } else if (aceChoice == 11) {

                    compValue = 11;

                } else {

                    System.out.println("your input was invalid");

                }
            }
            case "2 of Spades", "2 of Diamonds", "2 of Clubs", "2 of Hearts" -> compValue = 2;
            case "3 of Spades", "3 of Diamonds", "3 of Clubs", "3 of Hearts" -> compValue = 3;
            case "4 of Spades", "4 of Diamonds", "4 of Clubs", "4 of Hearts" -> compValue = 4;
            case "5 of Spades", "5 of Diamonds", "5 of Clubs", "5 of Hearts" -> compValue = 5;
            case "6 of Spades", "6 of Diamonds", "6 of Clubs", "6 of Hearts" -> compValue = 6;
            case "7 of Spades", "7 of Diamonds", "7 of Clubs", "7 of Hearts" -> compValue = 7;
            case "8 of Spades", "8 of Clubs", "8 of Diamonds", "8 of Hearts" -> compValue = 8;
            case "9 of Spades", "9 of Diamonds", "9 of Clubs", "9 of Hearts" -> compValue = 9;
            case "10 of Spades", "10 of Hearts", "10 of Diamonds", "10 of Clubs", "Jack of Spades",
                    "Jack of Diamonds", "Jack of Clubs", "Jack of Hearts", "Queen of Spades",
                    "Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "King of Spades",
                    "King of Diamonds", "King of Clubs", "King of Hearts" -> compValue = 10;
            default -> System.out.println("Error");
            // this will be the value the computer shows;
            //this is the computers card
            //this will help determine if the computer has exceeded the limit;
        }

        switch (compCard2Hidden) {
            case "Ace of Spades", "Ace of Diamonds", "Ace of Clubs", "Ace of Hearts" -> {
                System.out.println("would you like to have your ace equal 1 or ll:");
                aceChoice = scanner.nextInt();
                if (aceChoice == 1) {

                    compValueHidden = 1;

                } else if (aceChoice == 11) {

                    compValueHidden = 11;

                } else {

                    System.out.println("your input was invalid");

                }
            }
            case "2 of Spades", "2 of Diamonds", "2 of Clubs", "2 of Hearts" -> compValueHidden = 2;
            case "3 of Spades", "3 of Diamonds", "3 of Clubs", "3 of Hearts" -> compValueHidden = 3;
            case "4 of Spades", "4 of Diamonds", "4 of Clubs", "4 of Hearts" -> compValueHidden = 4;
            case "5 of Spades", "5 of Diamonds", "5 of Clubs", "5 of Hearts" -> compValueHidden = 5;
            case "6 of Spades", "6 of Diamonds", "6 of Clubs", "6 of Hearts" -> compValueHidden = 6;
            case "7 of Spades", "7 of Diamonds", "7 of Clubs", "7 of Hearts" -> compValueHidden = 7;
            case "8 of Spades", "8 of Clubs", "8 of Diamonds", "8 of Hearts" -> compValueHidden = 8;
            case "9 of Spades", "9 of Diamonds", "9 of Clubs", "9 of Hearts" -> compValueHidden = 9;
            case "10 of Spades", "10 of Hearts", "10 of Diamonds", "10 of Clubs", "Jack of Spades",
                    "Jack of Diamonds", "Jack of Clubs", "Jack of Hearts", "Queen of Spades",
                    "Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "King of Spades",
                    "King of Diamonds", "King of Clubs", "King of Hearts" -> compValueHidden = 10;
            default -> System.out.println("Error");
            // this will be the value the computer hides;
            //this is the computer card
            // this will help determine if the computer chooses more that 21;
        }
        //creates total value for comp and player
        //this is to remain hidden
        System.out.println("The computer has two hidden cards");

        int compAddedValue = compValue + compValueHidden;

        return compAddedValue;

    }
}
