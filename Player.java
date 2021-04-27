/* Printing players for BlackJack
 * Matthew W. Gavin R. Caleb P. Sean C.
 * 26 April 2021
 * Where I keep the information about each player
 */


public class Player {
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
