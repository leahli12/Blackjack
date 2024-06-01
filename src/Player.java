public class Player {
    public int playerNum;
    public String playerName;
    public Card[] hand;

    public Player(int pPlayerNum){
        playerNum = pPlayerNum;
        hand = new Card[2];
    }

    public void printInfo(){
        if (playerNum == 0){
            System.out.println("Dealer");
        }
        else {
            System.out.println("Player Number " + playerNum);
        }
        for(int i = 0; i < hand.length; i++){
            hand[i].printInfo();
        }
    }
}
