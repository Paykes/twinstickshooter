package thing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ThingTypeTest {

    @Test
    void testValuesExist() {
        assertThat(ThingType.values().length).isGreaterThan(0);
    }

    @Test
    void testSize() {
        assertThat(ThingType.BULLET.getBound()).isEqualTo(5);
    }
}
