package entities.persons;
import locations.*;
import entities.things.*;

public interface Marauding {
    void hopOff();
    void disappear(Place from);
    void appear(Place place);
    void burst();
    void take(Thing thing, Place from);
    void pointTo(Person him);
    void douseWith(Place location, Tank tank);
}
