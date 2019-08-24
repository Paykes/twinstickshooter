package field;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import thing.Thing;

class FieldTest {
	private Field field;

	@BeforeEach
	void setup() {
		field = new Field();
	}

	@Test
	void testNoThings() {
		assertThat(field.getThingCount()).isEqualTo(0);
	}

	@Test
	void testAddThing() {
		field.addThing(new Thing(4, 5));
		assertThat(field.getThingCount()).isEqualTo(1);
		field.addThing(new Thing(4, 7));
		assertThat(field.getThingCount()).isEqualTo(2);
	}

	@Test
	void testRemoveThing() {
		Thing thing = new Thing(5, 9);
		field.addThing(thing);
		field.removeThing(thing);
		assertThat(field.getThingCount()).isEqualTo(0);
	}

	@Test
	void testMoveThings() {
		Thing thing1 = new Thing(5, 2);
		thing1.setVelocity(0, 1);
		Thing thing2 = new Thing(5, 8);
		thing2.setVelocity(0, -1);
		field.addThing(thing1);
		field.addThing(thing2);
		field.tick(2000);
		assertThat(thing1.getPosition().getY()).isEqualTo(4);
		assertThat(thing2.getPosition().getY()).isEqualTo(6);
	}
}
