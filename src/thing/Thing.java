package thing;

import geometry.Position;
import geometry.Vector;

public class Thing {
    private Position position;
    private Vector velocity;

    public Thing(float x, float y) {
        this.position = new Position(x, y);
        this.velocity = new Vector(0, 0);
    }

    public Position getPosition() {

        return position;
    }

    public void setVelocity(float dx, float dy) {

        this.velocity = new Vector(dx, dy);
    }

    public void move(int ticks) {

        this.position = velocity.mult(ticks / 1000f).addTo(position);
    }
}
