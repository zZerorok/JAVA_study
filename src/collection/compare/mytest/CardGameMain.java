package collection.compare.mytest;

import java.util.ArrayList;
import java.util.List;

public class CardGameMain {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("플레이어1"));
        players.add(new Player("플레이어2"));

        Deck deck = new Deck();
        drawCards(players, deck);

        printPlayerCards(players);
        printWinner(findWinner(players));
    }

    private static void drawCards(List<Player> players, Deck deck) {
        for (Player player : players) {
            player.addCards(deck.drawCards());
        }
    }

    private static void printPlayerCards(List<Player> players) {
        for (Player player : players) {
            player.printCards();
        }
    }

    private static Player findWinner(List<Player> players) {
        Player winner = null;
        int highScore = 0;

        for (Player player : players) {
            int playerScore = player.getTotalScore();
            if (playerScore > highScore) {
                highScore = playerScore;
                winner = player;
            } else if (playerScore == highScore) {
                winner = null;
            }
        }
        return winner;
    }

    private static void printWinner(Player winner) {
        if (winner == null) {
            System.out.println("무승부");
        } else {
            System.out.println(winner.getName() + " 승리");
        }
    }
}
