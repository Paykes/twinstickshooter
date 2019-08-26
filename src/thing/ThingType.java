package thing;

public enum ThingType {
    PLAYER(50),
    ENEMY(50),
    FIRE(300),
    BULLET(5);

    private int bound;

    private ThingType(int bound) {
        this.bound = bound;
    }

    public int getBound() {
        return bound;
    }


}
