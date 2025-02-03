package collection.compare.mytest;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    public int getTotalScore() {
        return cards.stream()
                .mapToInt(Card::getNumber)
                .sum();
    }

    public void printCards() {
        List<Card> sortedCards = cards.stream()
                .sorted()
                .toList();

        System.out.println(name + "의 카드: " + sortedCards + ", 합계: " + getTotalScore());
    }
}
