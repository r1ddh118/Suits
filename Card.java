public class Card {
    String rank;
    String suit;
    //description of a card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public String toString() {
        return rank + " of " + suit;
    }
}

