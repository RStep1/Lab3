package entities.persons;
import entities.things.Thing;

public interface ThingInteraction {
    void snatch(Thing thing, Hand hand, Person owner);
}
