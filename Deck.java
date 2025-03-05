import java.util.*;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>(); //array list of deck of cards
    }
    
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
        //addition of cards
        deck.clear();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }
//display deck
    public void displayDeck() {
        System.out.println("________Deck_________");
        for (Card card : deck) {
            System.out.println(card);
        }
    }
//shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
//print the card using index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println("Selected Card: " + deck.get(index));
        } else {
            System.out.println("Invalid index. Please enter between 0 and 51.");
        }
    }
//print the same card
    public void sameCard(String suit) {
        System.out.println("Cards with suit " + suit + ":");
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }
//compare the cards
    public void compareCard(String rank) {
        System.out.println("Cards with rank " + rank + ":");
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }
//find the card
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card Found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }
//deal the cards
    public void dealCard() {
        if (deck.size() < 5) {
            System.out.println("Not enough cards to deal 5 cards.");
            return;
        }
        System.out.println("Dealing 5 random cards:");
        Collections.shuffle(deck);
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }
}

