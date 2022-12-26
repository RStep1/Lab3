package entities.persons;
import locations.*;
import entities.things.*;

public interface IBandit {
    void hopOff();
    void disappear();
    void appear(Place place);
    void burst();
    void hit(Thing thing, AbstractPerson target, String targetBodyPart);
    void douseWith(Place location, Thing thing);
}
