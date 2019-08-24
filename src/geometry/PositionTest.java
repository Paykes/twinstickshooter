package geometry;

import geometry.Position;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {
	@Test
	public void testOriginHasXYOfZero() {
		assertThat(new Position(3, 4).getX()).isEqualTo(3);
		assertThat(new Position(3, 4).getY()).isEqualTo(4);
		assertThat(new Position(7, 4).getX()).isEqualTo(7);
	}

}