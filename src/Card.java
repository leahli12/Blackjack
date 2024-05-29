public class Card {
    public int cardNum, suitNum, cardValue; // For a K, cardNum = 13 and cardValue = 10
    public String suitName, cardName;

    public Card(int cNum, int sNum){
        cardNum = cNum;
        if (cNum == 1){
            cardName = "Ace";
        } else if (cNum == 11){
            cardName = "Jack";
        } else if (cNum == 12){
            cardName = "Queen";
        } else if (cNum == 13){
            cardName = "King";
        } else {
            cardName = Integer.toString(cNum);
        }

        if (sNum == 0){
            suitName = "Spades";
        } else if (sNum == 1){
            suitName = "Hearts";
        } else if (sNum == 2){
            suitName = "Clubs";
        }  else if (sNum == 3) {
            suitName = "Diamonds";
        }
    }

    public void printInfo(){
        System.out.println("You have a " + cardName + " of " + suitName);
    }

}
