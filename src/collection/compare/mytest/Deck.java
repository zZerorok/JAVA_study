package collection.compare.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int number = 1; number < 14; number++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(suit, number));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> drawCards() {
        List<Card> drawnCards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            drawnCards.add(cards.remove(i));
        }
        return drawnCards;
    }
}
