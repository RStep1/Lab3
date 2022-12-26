package entities.persons.croud_of_people;
import locations.*;
public class People implements IPeople {
    private String name;
    public People(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void runTo(Place place) {
        ////////////////
    }
}
