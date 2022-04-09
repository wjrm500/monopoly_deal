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
        deck.cards.add(new PropertyCard(PropertySetType.BROWN, "Whitechapel Road"));
        deck.cards.add(new PropertyCard(PropertySetType.LIGHT_BLUE, "The Angel Islington"));
        deck.cards.add(new PropertyCard(PropertySetType.LIGHT_BLUE, "Euston Road"));
        deck.cards.add(new PropertyCard(PropertySetType.LIGHT_BLUE, "Pentonville Road"));
        deck.cards.add(new PropertyCard(PropertySetType.PINK, "Pall Mall"));
        deck.cards.add(new PropertyCard(PropertySetType.PINK, "Whitehall"));
        deck.cards.add(new PropertyCard(PropertySetType.PINK, "Northumberland Avenue"));
        deck.cards.add(new PropertyCard(PropertySetType.ORANGE, "Bow Street"));
        deck.cards.add(new PropertyCard(PropertySetType.ORANGE, "Marlborough Street"));
        deck.cards.add(new PropertyCard(PropertySetType.ORANGE, "Vine Street"));
        deck.cards.add(new PropertyCard(PropertySetType.RED, "The Strand"));
        deck.cards.add(new PropertyCard(PropertySetType.RED, "Fleet Street"));
        deck.cards.add(new PropertyCard(PropertySetType.RED, "Trafalgar Square"));
        deck.cards.add(new PropertyCard(PropertySetType.YELLOW, "Leicester Square"));
        deck.cards.add(new PropertyCard(PropertySetType.YELLOW, "Coventy Street"));
        deck.cards.add(new PropertyCard(PropertySetType.YELLOW, "Piccadilly"));
        deck.cards.add(new PropertyCard(PropertySetType.GREEN, "Regent Street"));
        deck.cards.add(new PropertyCard(PropertySetType.GREEN, "Oxford Street"));
        deck.cards.add(new PropertyCard(PropertySetType.GREEN, "Bond Street"));
        deck.cards.add(new PropertyCard(PropertySetType.DARK_BLUE, "Park Lane"));
        deck.cards.add(new PropertyCard(PropertySetType.DARK_BLUE, "Mayfair"));
        deck.cards.add(new PropertyCard(PropertySetType.STATION, "King's Cross Station"));
        deck.cards.add(new PropertyCard(PropertySetType.STATION, "Marylebone Station"));
        deck.cards.add(new PropertyCard(PropertySetType.STATION, "Fenchurch Street Station"));
        deck.cards.add(new PropertyCard(PropertySetType.STATION, "Liverpool Street Station"));
        deck.cards.add(new PropertyCard(PropertySetType.UTILITY, "Water Works"));
        deck.cards.add(new PropertyCard(PropertySetType.UTILITY, "Electric Company"));
        return deck;
    }
}
