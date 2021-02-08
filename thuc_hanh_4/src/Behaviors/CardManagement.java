package Behaviors;

import Entities.Card;

import java.util.ArrayList;

public class CardManagement {
    ArrayList<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public void showAllCard() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }

    public Card getCardById(int id) {
        Card card = new Card();
        for (Card c : cards) {
            if (c.getId() == id) {
                card = c;
            }
        }
        return card;
    }

}
