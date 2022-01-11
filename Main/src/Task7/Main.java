package Task7;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Card> cardSet = new HashSet<Card>();

        cardSet.add(new Card("Diamonds", "6"));
        cardSet.add(new Card("Diamonds", "7"));
        cardSet.add(new Card("Diamonds", "8"));
        cardSet.add(new Card("Diamonds", "9"));
        cardSet.add(new Card("Diamonds", "10"));
        cardSet.add(new Card("Diamonds", "Jack"));
        cardSet.add(new Card("Diamonds", "Queen"));
        cardSet.add(new Card("Diamonds", "King"));
        cardSet.add(new Card("Diamonds", "Ace"));

        cardSet.add(new Card("Hearts", "6"));
        cardSet.add(new Card("Hearts", "7"));
        cardSet.add(new Card("Hearts", "8"));
        cardSet.add(new Card("Hearts", "9"));
        cardSet.add(new Card("Hearts", "10"));
        cardSet.add(new Card("Hearts", "Jack"));
        cardSet.add(new Card("Hearts", "Queen"));
        cardSet.add(new Card("Hearts", "King"));
        cardSet.add(new Card("Hearts", "Ace"));

        cardSet.add(new Card("Clubs", "6"));
        cardSet.add(new Card("Clubs", "7"));
        cardSet.add(new Card("Clubs", "8"));
        cardSet.add(new Card("Clubs", "9"));
        cardSet.add(new Card("Clubs", "10"));
        cardSet.add(new Card("Clubs", "Jack"));
        cardSet.add(new Card("Clubs", "Queen"));
        cardSet.add(new Card("Clubs", "King"));
        cardSet.add(new Card("Clubs", "Ace"));

        cardSet.add(new Card("Spades", "6"));
        cardSet.add(new Card("Spades", "7"));
        cardSet.add(new Card("Spades", "8"));
        cardSet.add(new Card("Spades", "9"));
        cardSet.add(new Card("Spades", "10"));
        cardSet.add(new Card("Spades", "Jack"));
        cardSet.add(new Card("Spades", "Queen"));
        cardSet.add(new Card("Spades", "King"));
        cardSet.add(new Card("Spades", "Ace"));

        cardSet.add(new Card("Spades", "Ace"));
        cardSet.add(new Card("Clubs", "Ace"));
        cardSet.add(new Card("Hearts", "Ace"));
        cardSet.add(new Card("Diamonds", "Ace"));

        System.out.println(cardSet.size());
    }
}
