package entities.things;

import entities.Flammable;
import entities.Entity;

public class Thing extends Entity implements Flammable {
    public Thing(String name) {
        super(name);
    }

    @Override
    public void inflame(String condition) {
        System.out.println("пламя пожирает " + getName() +
                " " + condition);
    }
}
