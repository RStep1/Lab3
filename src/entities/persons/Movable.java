package entities.persons;
import entities.things.*;

public interface Movable extends Running{
    void fallBackward();
    void fallInto(Tank tank);
    void getOutOf(Tank tank);
}
