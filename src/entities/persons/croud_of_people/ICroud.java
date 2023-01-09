package entities.persons.croud_of_people;
import entities.persons.Person;
import locations.GlassDoor;

public interface ICroud extends IPeople {
    void scream();
    void crash(Person person);
    void dislodge(GlassDoor glassDoor);
}
