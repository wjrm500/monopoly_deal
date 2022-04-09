package game;

public enum PropertySetType {
    BROWN(1),
    LIGHT_BLUE(1),
    PINK(2),
    ORANGE(2),
    RED(3),
    YELLOW(3),
    GREEN(4),
    DARK_BLUE(4),
    STATION(2),
    UTILITY(2);

    public int value;

    PropertySetType(int value) {
        this.value = value;
    }
}
