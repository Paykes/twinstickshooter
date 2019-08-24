package geometry;

public class Vector {
    private final float dx;
    private final float dy;

    public Vector(float dx, float dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Position addTo(Position position) {
        return new Position(position.getX() + dx, position.getY() + dy);
    }

    public Vector mult(float factor) {
        return new Vector(dx * factor, dy * factor);
    }
}
