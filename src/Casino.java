import java.util.ArrayList;

public class Casino {
    public Card[] deck;
    Player[] players = new Player[3];
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

    }

    public void shuffle(){
        for (int i = 0; i < 104; i++){
            int rand1 = (int)(Math.random() * 52);
            int rand2 = (int)(Math.random() * 52);
            Card temp = deck[rand2];
            deck[rand2] = deck[rand1];
            deck[rand1] = temp;
        }
//        ArrayList<Integer> indices = new ArrayList<>(52);
//        for (int i = 0; i < 52; i++){
//            indices.add(i);
//        }
//        for (int i = 0; i < 26; i++){
//            int ran1 = (int)(Math.random() * (indices.size() - 1));
//            int ran2 = (int)(Math.random() * (indices.size() - 1));
//            if (ran1 == ran2) {
//                ran1 = (int) (Math.random() * (indices.size() - 1));
//                ran2 = (int) (Math.random() * (indices.size() - 1));
//            }
//            int ranIndex1 = indices.get(ran1);
//            int ranIndex2 = indices.get(ran2);
//            Card temp = deck[ranIndex2];
//            deck[ranIndex2] = deck[ranIndex1];
//            deck[ranIndex1] = temp;
//            indices.remove(ran1);
//            indices.remove(ran2);
//            System.out.println(indices);
//        }
    } // Make an ArrayList of indices
    // Swap the two in deck
    // Get rid of the indices used
    // Guarantee a swap for everything at once
}
