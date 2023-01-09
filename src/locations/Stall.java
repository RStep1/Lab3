package locations;
import java.util.ArrayList;

import entities.things.Thing;
import entities.things.Basket;

public class Stall extends Place {
    private ArrayList<Thing> thingsOn = new ArrayList<>();
    public Stall(String name, Thing... things) {
        super(name);
        for (Thing thing : things) {
            this.thingsOn.add(thing);
        }
    }
    public void addThingsOn(Thing... things) {
        for (Thing thing : things) {
            this.thingsOn.add(thing);
        }
    }
    public ArrayList<Thing> getThingsOn() {
        return thingsOn;
    }

    @Override
    public void inflame(String condition) {
        System.out.print(getName() + " вспыхнул " + condition);
        for (Thing thing : getThingsOn()) {
            if (thing instanceof Basket) {
                Basket basket = (Basket) thing;
                basket.getThingOn().inflame("на " + basket +
                        " с " + basket.getWhatIsInside());
            }
        }
    }
}
