/* Deck for BlackJack
 * Matthew W. Gavin R. Caleb
 * 4 April 2021
 * First Create the 4 suits
 */
import java.util.Scanner;
import java.util.Random;
public class Deck {
    private Scanner scanner = new Scanner(System.in);
    private int users;
    private Player[] players;
    private Deck deck;
    private Dealer dealer = new Dealer();
    public static void main(String[] args) {
        Random random = new Random();
        int generateSuit = random.nextInt(4);
        int generateCard = random.nextInt(13);
        int generateSuit2 = random.nextInt(4);
        int generateCard2 = random.nextInt(13);
        int generateSuit3 = random.nextInt(4);
        int generateCard3 = random.nextInt(13);
        int generateSuit4 = random.nextInt(4);
        int generateCard4 = random.nextInt(13);
        //im not done with this yet don't edit it plz
        //generates two cards randomly for each player
        String[] card = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] value = {"Ace of ", "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of "
                , "10 of ", "Jack of ", "Queen of ", "King of "};
        String compCard1 = value[generateCard] + card[generateSuit];
        switch (compCard1){
            case "Ace of Spades":
                break;
            case "Ace of Diamonds":
                break;
            case "Ace of Clubs":
                break;
            case "Ace of Hearts":
                break;
            case "2 of Spades":
                break;
            case "2 of Diamonds":
                break;
            case "2 of Clubs":
                break;
            case "2 of Hearts":
                break;
        }
        String compCard2 = value[generateCard2] + card[generateSuit2];
        String playerCard1 = value[generateCard3] + card[generateSuit3];
        String playerCard2 = value[generateCard4] + card[generateSuit4];
        System.out.println(compCard1 + compCard2 + playerCard1 + playerCard2);
    }
}
