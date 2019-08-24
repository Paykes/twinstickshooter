package geometry;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorTest {
    @Test
    public void testAddVectorToPosition() {
        Position position = new Position(5, 6);
        assertThat(new Vector(1, 1).addTo(position).getX()).isEqualTo(6);
    }

    @Test
    public void testMultVector() {
        Vector vector = new Vector(2, 3);
        Position position = new Position(5, 6);
        assertThat(vector.mult(2).addTo(position).getX()).isEqualTo(9);
        assertThat(vector.mult(.5f).addTo(position).getX()).isEqualTo(6);
    }
}
