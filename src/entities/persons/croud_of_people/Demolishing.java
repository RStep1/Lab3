package entities.persons.croud_of_people;
import entities.persons.Person;
import entities.persons.Running;
import locations.GlassDoor;

public interface Demolishing extends Running {
    void crash(Person person);
    void dislodge(GlassDoor glassDoor);
}
