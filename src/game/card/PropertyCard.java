package game.card;

import game.PropertySetType;

public class PropertyCard extends Card {
    public PropertySetType type;
    public String name;

    public PropertyCard(PropertySetType type, String name) {
        this.type = type;
        value = this.type.value;
        this.name = name;
    }
}
