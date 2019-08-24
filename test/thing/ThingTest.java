package thing;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

class ThingTest {
    private Thing thing;

    @BeforeEach
    void setup() {
        thing = new Thing(4, 5);
    }

    @Test
    void testNotNull() {
        assertThat(thing).isNotNull();
    }

    @Test
    void testPosition() {
        assertThat(thing.getPosition().getX()).isEqualTo(4);
        assertThat(thing.getPosition().getY()).isEqualTo(5);
    }

    @Test
    void testMoveOneSecond() {
        thing.setVelocity(3, 4);
        thing.move(1000);
        assertThat(thing.getPosition().getX()).isEqualTo(7);
        assertThat(thing.getPosition().getY()).isEqualTo(9);
    }

    @Test
    void testMoveHalfSecond() {
        thing.setVelocity(6, 8);
        thing.move(500);
        assertThat(thing.getPosition().getX()).isEqualTo(7);
        assertThat(thing.getPosition().getY()).isEqualTo(9);
    }

}