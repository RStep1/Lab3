package entities.persons;
import locations.*;
import entities.Entity;
import entities.things.*;

public interface IPerson {
    void scream(String phrase);
    void runTo(Place location);
    void runAfter(AbstractPerson person);
    void fallBackwardOn(Entity entity);
    void fallInto(Tank tank);
    void getOutOf(Thing thing);
}
