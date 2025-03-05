# Card Deck Java Program

## Overview
This Java program implements a menu-driven application for managing a deck of 52 playing cards. It includes functionalities such as creating, shuffling, printing, dealing, and searching for cards. The program follows Object-Oriented Programming (OOP) principles and is structured using separate Java files for `Main`, `Deck`, and `Card` classes.

## File Structure
- `Main.java` - The main driver file that provides a menu-driven interface for interacting with the deck.
- `Card.java` - Defines the `Card` class to represent individual cards.
- `Deck.java` - Implements the `Deck` class, which contains various operations on the deck.

## Classes and Methods
### **1. Card Class (`Card.java`):**
This class represents a playing card with two attributes:
- `rank`: The rank of the card (e.g., 2, 3, ... Ace).
- `suit`: The suit of the card (Clubs, Diamonds, Spades, Hearts).

**Methods:**
- `Card(String rank, String suit)`: Constructor to initialize a card.
- `toString()`: Returns a string representation of the card in the format "Rank of Suit".

### **2. Deck Class (`Deck.java`):**
This class manages a deck of 52 cards and provides various functionalities.

**Methods:**
- `Deck()`: Constructor that initializes an empty deck.
- `createDeck()`: Generates a complete deck of 52 cards with all suits and ranks.
- `displayDeck()`: Prints all the cards in the deck.
- `shuffleDeck()`: Randomizes the order of the deck.
- `printCard(int index)`: Prints the card at the given index.
- `sameCard(String suit)`: Displays all cards of the given suit.
- `compareCard(String rank)`: Displays all cards with the specified rank.
- `findCard(String rank, String suit)`: Searches for a specific card in the deck and prints if found.
- `dealCard()`: Randomly selects and prints five cards from the deck.

### **3. Main Class (`Main.java`):**
This class provides a menu-driven interface for users to interact with the deck.

**Menu Options:**
1. **Create Deck**: Calls `createDeck()` to initialize a new deck.
2. **Print Deck**: Calls `displayDeck()` to print all the cards.
3. **Shuffle Deck**: Calls `shuffleDeck()` to shuffle the deck.
4. **Print a Card**: Calls `printCard(index)` to print a specific card.
5. **Find Same Suit Cards**: Calls `sameCard(suit)` to display all cards of a specific suit.
6. **Compare Cards (Same Rank)**: Calls `compareCard(rank)` to display all cards of a specific rank.
7. **Search for a Card**: Calls `findCard(rank, suit)` to search for a specific card.
8. **Deal 5 Random Cards**: Calls `dealCard()` to print five random cards.
9. **Exit**: Exits the program.

