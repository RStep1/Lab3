package entities.persons.croud_of_people;
import entities.persons.Running;
import locations.*;
import entities.Entity;

public class People extends Entity implements Running {
    public People(String name) {
        super(name);
    }

    @Override
    public void runTo(Place from, Place to) {
        from.removeEntity(this);
        to.addEntities(this);
        System.out.println(getName() + " бегут от " +
                from + " в " + to);
    }
}
