package entities.things;

import entities.Burning;
import entities.Entity;

public class Thing extends Entity implements Burning {
    public Thing(String name) {
        super(name);
    }

    @Override
    public void inflame(String condition) {
        System.out.println("пламя пожирает " + getName() +
                " " + condition);
    }
}
