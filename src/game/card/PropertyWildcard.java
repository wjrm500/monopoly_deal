package game.card;

import game.PropertySetType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertyWildcard extends Card {
    public List<PropertySetType> propertySetTypes;

    public PropertyWildcard(PropertySetType propertySetType1, PropertySetType propertySetType2) {
        propertySetTypes = new ArrayList<>();
        propertySetTypes.add(propertySetType1);
        propertySetTypes.add(propertySetType2);
    }

    public PropertyWildcard() {
        this.propertySetTypes = Arrays.asList(PropertySetType.class.getEnumConstants());
    }
}
