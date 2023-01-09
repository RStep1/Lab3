package entities.persons;
import locations.*;
import entities.things.*;

public interface IPerson {
    void scream(String phrase, String condition);
    void runTo(Place from, Place to);
    void fallBackward();
    void fallInto(Tank tank);
    void getOutOf(Tank tank);
}
