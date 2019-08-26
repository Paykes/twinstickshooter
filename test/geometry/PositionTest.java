package geometry;

import geometry.Position;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class PositionTest {
	@Test
	public void testOriginHasXYOfZero() {
		assertThat(new Position(3, 4).getX()).isEqualTo(3);
		assertThat(new Position(3, 4).getY()).isEqualTo(4);
		assertThat(new Position(7, 4).getX()).isEqualTo(7);
	}

	@Test
	void testDistance() {
		assertThat(new Position(4, 6).distanceTo(new Position(4, 6))).isEqualTo(0);
		assertThat(new Position(4, 6).distanceTo(new Position(7, 6))).isCloseTo(3, within(0.01f));
		assertThat(new Position(4, 6).distanceTo(new Position(4, 2))).isCloseTo(4, within(0.01f));
		assertThat(new Position(4, 6).distanceTo(new Position(7, 2))).isCloseTo(5, within(0.01f));
	}

}