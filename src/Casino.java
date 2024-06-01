import java.util.ArrayList;

public class Casino {
    public Card[] deck;
    public Player[] players = new Player[3];
    public Player dealer;
    public static void main(String[] args) {
        Casino vegas = new Casino();
        System.out.println("Welcome to Vegas...");

    }

    public Casino(){
        deck = new Card[52];
        int counter = 0;
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i < 14; i++) {
                deck[counter] = new Card(i, k);
                counter++;
            }
        }
        shuffle();
//        for (int i = 0; i < 52; i++){
//            deck[i].printInfo();
//        }
        for (int i = 0; i < 3; i++){
            players[i] = new Player(i + 1);
        }
        dealer = new Player(0);
        deal();
        dealer.printInfo();
        for (int i = 0; i < 3; i++){
            players[i].printInfo();
        }
    }

    public void shuffle(){
        for (int i = 0; i < 104; i++){
            int rand1 = (int)(Math.random() * 52);
            int rand2 = (int)(Math.random() * 52);
            Card temp = deck[rand2];
            deck[rand2] = deck[rand1];
            deck[rand1] = temp;
        }
    }

    public void deal(){
        dealer.hand[0] = deck[0];
        dealer.hand[1] = deck[1];
        int currentIndex = 2;
        for (int i = 0; i < 2; i ++){
            players[0].hand[i] = deck[currentIndex];
            currentIndex++;
            players[1].hand[i] = deck[currentIndex];
            currentIndex++;
            players[2].hand[i] = deck[currentIndex];
            currentIndex++;
        }
    }
}
