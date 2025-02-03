package collection.compare.mytest;

public class Card implements Comparable<Card> {
    private final Suit suit;
    private final int number;

    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card other) {
        if (this.number == other.number) {
            return Integer.compare(this.suit.ordinal(), other.suit.ordinal());
        }

        return Integer.compare(this.number, other.number);
    }

    @Override
    public String toString() {
        return number + "(" + suit.getIcon() + ")";
    }
}
