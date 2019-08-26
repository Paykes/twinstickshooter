package field;

import geometry.Position;
import thing.Thing;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Thing> thingsList = new ArrayList<Thing>();

    public void addThing(Thing thing) {
        thingsList.add(thing);
    }

    public void removeThing(Thing thing) {
        thingsList.remove(thing);
    }

    public int getThingCount() {
        return thingsList.size();
    }

    public void tick(int ticks) {
        for (Thing thing : thingsList) {
            thing.move(ticks);
        }
    }
}
