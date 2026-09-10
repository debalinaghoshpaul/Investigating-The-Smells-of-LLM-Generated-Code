import java.util.ArrayList;
import java.util.Collections;

class Card {
    private String suit;
    private String name;

    public Card(String suit, String name) {
        this.suit = suit;
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}

class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (String suit : suits) {
            for (String name : names) {
                cards.add(new Card(suit, name));
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null;
        }
    }

    public void sortByName() {
        cards.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
    }
}

class Hand extends Deck {
    public Hand() {
        super();
    }
}

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("Deck after shuffling:");
        deck.printDeck();

        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        for (int i = 0; i < 5; i++) {
            hand1.addCard(deck.removeCard());
            hand2.addCard(deck.removeCard());
        }

        System.out.println("\nHand 1:");
        hand1.printDeck();
        System.out.println("\nHand 2:");
        hand2.printDeck();

        hand1.sortByName();
        hand2.sortByName();

        System.out.println("\nHand 1 after sorting:");
        hand1.printDeck();
        System.out.println("\nHand 2 after sorting:");
        hand2.printDeck();

        // Return cards to the deck
        while (!hand1.isEmpty()) {
            deck.addCard(hand1.removeCard());
        }
        while (!hand2.isEmpty()) {
            deck.addCard(hand2.removeCard());
        }

        System.out.println("\nDeck after returning cards:");
        deck.printDeck();
    }
}
