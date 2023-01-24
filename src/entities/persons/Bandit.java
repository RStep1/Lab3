package entities.persons;
import entities.things.*;
import locations.Place;
import entities.Entity;
import locations.Stall;

import java.util.ArrayList;

public class Bandit extends Entity implements Marauding, Shouting {
    private ArrayList<Thing> items = new ArrayList<>();

    public Bandit(String name) {
        super(name);
    }

    public ArrayList<Thing> getItems() {
        return items;
    }
    public void addItems(Thing... things) {
        for (Thing thing : things) {
            this.items.add(thing);
        }
    }
    public boolean removeItem(Thing thing) {
        for (Thing item : items) {
            if (item.equals(thing)) {
                items.remove(thing);
                return true;
            }
        }
        return false;
    }

    public void say(String phrase) {
        System.out.print(phrase);
    }
    @Override
    public void pointTo(Person him) {
        System.out.println(this + " указал на " + him);
    }
    @Override
    public void take(Thing thing, Place from) {
        if (from instanceof Stall) {
            Stall stall = (Stall) from;
            stall.removeThingOn(thing);
        }
        items.add(thing);
        System.out.println(this + " взял " + thing);
    }
    @Override
    public void shout(String phrase, String condition) {
        System.out.println(this + " воскликнул " + condition + ": " + phrase);
    }
    @Override
    public void hopOff() {
        System.out.println(getName() + " взлетает вверх");
    }
    @Override
    public void disappear(Place from) {
        from.removeEntity(this);
        System.out.println(getName() + " куда-то девался");
    }
    @Override
    public void appear(Place place) {
        place.addEntities(this);
        System.out.println(getName() + " оказался на " + place);
    }
    @Override
    public void burst() {
        System.out.println(getName() + " лопнул как воздушный шар");
    }

    @Override
    public void douseWith(Place location, Tank tank) {
        if (tank.getWhatIsInside() instanceof Liquid) {
            Liquid liquid = (Liquid) tank.getWhatIsInside();
            tank.setWhatIsInside(null);
            location.setDousedWith(liquid);
            System.out.println(getName() + " окатил из " +
                    tank +  " " + location + " " + liquid + "ом");
        }
    }
}
