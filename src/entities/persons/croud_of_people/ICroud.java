package entities.persons.croud_of_people;
import entities.persons.AbstractPerson;
import entities.persons.Emotions;
import entities.things.*;

public interface ICroud extends IPeople {
    void scream(Emotions emotion);
    void crash(AbstractPerson abstractPerson);
    void strike(Thing thing);
}
