import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public void sortDeckByName() {
        Collections.sort(cards, (c1, c2) -> c1.getName().compareTo(c2.getName()));
    }

    // Additional methods for playing blackjack can be added here

    public static void main(String[] args) {
        Deck deck = new Deck();

        // Add cards to the deck
        deck.addCard(new Card("Ace", "Spades"));
        deck.addCard(new Card("King", "Hearts"));
        deck.addCard(new Card("Queen", "Diamonds"));
        deck.addCard(new Card("Jack", "Clubs"));

        // Print the initial deck
        System.out.println("Initial deck:");
        deck.printDeck();

        // Shuffle the deck
        deck.shuffleDeck();
        System.out.println("Shuffled deck:");
        deck.printDeck();

        // Add a new card to the deck
        deck.addCard(new Card("10", "Hearts"));
        System.out.println("Deck after adding a card:");
        deck.printDeck();

        // Remove a card from the deck
        Card removedCard = deck.removeCard();
        System.out.println("Removed card: " + removedCard);

        // Sort the deck by name
        deck.sortDeckByName();
        System.out.println("Deck after sorting by name:");
        deck.printDeck();
    }
}

class Card {
    private String name;
    private String suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}
