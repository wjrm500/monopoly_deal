package game;

import game.card.PropertyCard;
import game.card.action.*;

public class Deck extends CardCollection {
    public static Deck build() {
        Deck deck = new Deck();
        for (int i = 0; i < 2; i++) deck.cards.add(new DealBreaker());
        for (int i = 0; i < 3; i++) deck.cards.add(new DebtCollector());
        for (int i = 0; i < 2; i++) deck.cards.add(new DoubleTheRent());
        for (int i = 0; i < 4; i++) deck.cards.add(new ForcedDeal());
        for (int i = 0; i < 3; i++) deck.cards.add(new Hotel());
        for (int i = 0; i < 3; i++) deck.cards.add(new House());
        for (int i = 0; i < 3; i++) deck.cards.add(new ItsMyBirthday());
        for (int i = 0; i < 3; i++) deck.cards.add(new JustSayNo());
        for (int i = 0; i < 10; i++) deck.cards.add(new PassGo());
        for (int i = 0; i < 3; i++) deck.cards.add(new SlyDeal());
        deck.cards.add(new PropertyCard(PropertySetType.BROWN, "Old Kent Road"));
        return deck;
    }
}
