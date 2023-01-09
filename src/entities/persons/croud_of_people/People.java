package entities.persons.croud_of_people;
import locations.*;
import entities.Entity;

public class People extends Entity implements IPeople {
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
