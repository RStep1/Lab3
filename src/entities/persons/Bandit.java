package entities.persons;
import entities.things.*;
import events.Sounds;
import events.ShortSound;
import locations.Place;
import entities.Entity;

public class Bandit extends Entity implements IBandit, TrayInteraction {
    private Thing inLeftHand;
    private Thing inRightHand;
    public Bandit(String name) {
        super(name);
    }
    public Thing getInLeftHand() {
        return this.inLeftHand;
    }
    public Thing getInRightHand() {
        return this.inRightHand;
    }
    public void setInLeftHand(Thing thing) {
        this.inLeftHand = thing;
    }
    public void setInRightHand(Thing thing) {
        this.inRightHand = thing;
    }

    @Override
    public void hopOff() {
        System.out.println(getName() + " взлетает вверх");
    }
    @Override
    public void disappear(Place from) {
        from.removeEntity(this);
        System.out.println(getName() + " куда-то девался");
    }
    @Override
    public void appear(Place place) {
        place.addEntities(this);
        System.out.println(getName() + " оказался на " + place);
    }
    @Override
    public void burst() {
        System.out.println(getName() + " лопнул как воздушный шар");
    }
    @Override
    public void hit(Hand hand, Person target, String targetBodyPart) {
        System.out.print(this);
        Thing thing = null;
        switch (hand) {
            case LEFT_HAND -> {
                System.out.print(" левой рукой");
                thing = inLeftHand;
            }
            case RIGHT_HAND -> {
                System.out.print(" правой рукой");
                thing = inRightHand;
            }
        }
        System.out.println(" с размаху ударил " + thing + "ом " +
                target + " " + targetBodyPart);

        if (thing instanceof Tray) {
            ShortSound.playSound(Sounds.SHEET_METAL);
        }
    }
    @Override
    public void douseWith(Place location, Tank tank) {
        if (tank.getWhatIsInside() instanceof Liquid) {
            Liquid liquid = (Liquid) tank.getWhatIsInside();
            tank.setWhatIsInside(null);
            location.setDousedWith(liquid);
            System.out.println(getName() + " окатил из " +
                    tank +  " " + location + " " + liquid + "ом");
        }
    }
    @Override
    public void snatch(Thing thing, Hand hand, Person owner) {
        if (owner instanceof Foreigner) {
            Foreigner foreigner = (Foreigner) owner;
            foreigner.removeItem(thing);
            switch (hand) {
                case LEFT_HAND -> {this.inLeftHand = thing;
                    System.out.print("Левой рукой ");}
                case RIGHT_HAND -> this.inRightHand = thing;
            }
            System.out.println(getName() + " выхватил у "
                    + foreigner + " " + thing);
        }
    }
    @Override
    public void dropThing(Tray tray) {
        System.out.println(getName() + " сбросил " + tray.getThingOn() +
                 " c " + tray + "a");
        tray.setThingOn(null);
    }
}
