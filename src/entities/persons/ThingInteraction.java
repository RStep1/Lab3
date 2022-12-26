package entities.persons;
import entities.things.Thing;
import entities.persons.Hand;

public interface ThingInteraction {
    void snatch(Thing thing, Hand hand);
    void takeWithForce(Thing thing, Hand hand);
}
