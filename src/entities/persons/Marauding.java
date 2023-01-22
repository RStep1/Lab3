package entities.persons;
import locations.*;
import entities.things.*;

public interface Marauding {
    void hopOff();
    void disappear(Place from);
    void appear(Place place);
    void burst();
    void hit(Hand hand, Person target, String targetBodyPart);
    void douseWith(Place location, Tank tank);
}
