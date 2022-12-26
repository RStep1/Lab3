package entities.persons;
import entities.things.*;
import locations.Place;
import entities.Entity;

public class Bandit extends Entity implements IBandit, TrayInteraction {
    private Thing inLeftHand;
    private Thing inRightHand;
    public Bandit(String name) {
        super(name);
    }
    @Override
    public void hopOff() {
        System.out.println(getName() + " взлетает вверх\n");
    }
    @Override
    public void disappear() {

    }
    @Override
    public void appear(Place place) {
        ;
    }
    @Override
    public void burst() {
        System.out.println(getName() + "лопнул как воздушный шар\n");
    }
    @Override
    public void hit(Thing thing, AbstractPerson target, String targetBodyPart) {

    }
    @Override
    public void douseWith(Place location, Thing thing) {

    }
    @Override
    public void snatch(Thing thing, Hand hand) {

    }
    @Override
    public void takeWithForce(Thing thing, Hand hand) {

    }
    @Override
    public void dropThing() {

    }
}
