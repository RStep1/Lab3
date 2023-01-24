package entities.persons;

import java.util.ArrayList;
import entities.things.Thing;
import locations.Stall;


public class Foreigner extends Person {
    private Thing dousedWith;
    private final String description;
    private ArrayList<Thing> inventory = new ArrayList<>();
    public Foreigner(String name, Emotions emotion, String description, Thing... items) {
        super(name, emotion);
        this.description = description;
        for (Thing item : items) {
            this.inventory.add(item);
        }
    }
    public String getDescription() {
        return description;
    }
    boolean removeItem(Thing item) {
        for (Thing thing : inventory) {
            if (item.equals(thing)) {
                this.inventory.remove(item);
                return true;
            }
        }
        return false;
    }

    public void climbOver(Stall stall) {
        System.out.println(getName() + " перевалился через " +
                stall.getThingsOn() + " на " + stall);
    }

}
