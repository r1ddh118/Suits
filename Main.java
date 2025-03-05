// Name: Riddhi Poddar 
// PRN: 23070126105 
// Batch: 2023-27(B2)  

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;
        //do while to create a menudriven to perform the functions
        do {
            System.out.println("\n***** Card Deck Menu *****");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Shuffle Deck");
            System.out.println("4. Print a Card");
            System.out.println("5. Find Same Suit Cards");
            System.out.println("6. Compare Cards (Same Rank)");
            System.out.println("7. Search for a Card");
            System.out.println("8. Deal 5 Random Cards");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1://deck creation
                    deck.createDeck();
                    System.out.println("Deck created successfully.");
                    break;
                case 2://deck displayed
                    deck.displayDeck();
                    break;
                case 3://shuffling of deck
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled successfully.");
                    break;
                case 4://printing of card using index card
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 5://finding same suit cards
                    System.out.print("Enter suit (Clubs/Diamonds/Spades/Hearts): ");
                    String suit = scanner.next();
                    deck.sameCard(suit);
                    break;
                case 6://comparision of cards in terms of rank
                    System.out.print("Enter rank (2-10, Jack, Queen, King, Ace): ");
                    String rank = scanner.next();
                    deck.compareCard(rank);
                    break;
                case 7://search for a card
                    System.out.print("Enter rank: ");
                    String findRank = scanner.next();
                    System.out.print("Enter suit: ");
                    String findSuit = scanner.next();
                    deck.findCard(findRank, findSuit);
                    break;
                case 8: //dealing of cards
                    deck.dealCard();
                    break;
                case 9://exit
                    System.out.println("Exiting program...");
                    break;
                default://default statement
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
    }
}

