package entities.persons;

import entities.Entity;
import entities.things.Thing;
import entities.things.Tray;
import events.ShortSound;
import events.Sounds;
import locations.Stall;

public class OldMan extends Person implements TrayInteraction, Pugnacious {
    private ThingsInHands inHands = new ThingsInHands();
    private boolean beAngry;
    private String description;

    public OldMan(String name, Emotions emotion, String description) {
        super(name, emotion);
        this.description = description;
    }
    public OldMan(String name, String description) {
        this(name, Emotions.UNDEFINED, description);
    }

    public String getDescription() {
        return description;
    }
    private static class ThingsInHands {
        private Thing inLeftHand;
        private Thing inRightHand;
        public ThingsInHands(Thing inLeftHand, Thing inRightHand) {
            this.inLeftHand = inLeftHand;
            this.inRightHand = inRightHand;
        }
        public ThingsInHands() {
        }

        public Thing getInLeftHand() {
            return inLeftHand;
        }
        public Thing getInRightHand() {
            return inRightHand;
        }
        public void setInLeftHand(Thing inLeftHand) {
            this.inLeftHand = inLeftHand;
        }
        public void setInRightHand(Thing thing) {
            this.inLeftHand = thing;
        }
    }

    public void buying(Thing thing, Stall stall) {
        System.out.print("покупавший " + thing + " в " + stall);
        inHands.inRightHand = thing;
        inHands.inLeftHand = thing;
        stall.removeThingOn(thing);
    }
    public void changeСharacter() {
        class Eyes extends Entity {
            public Eyes(String name) {
                super(name);
            }
            public void flash(String condition) {
                System.out.println(this + " сверкнули " + condition + ", ");
            }
        }
        System.out.print("вдруг преобразился. ");
        beAngry = true;
        Eyes eyes = new Eyes("глаза");
        eyes.flash("боевым огнем");
        System.out.print("он ");
        setEmotion(Emotions.TURNS_PURPLE);
    }
    public void flung(String condition) {
        System.out.print("швырнул " + inHands.inRightHand + " " + condition);
    }
    @Override
    public void hit(Hand hand, Person target, String targetBodyPart) {
        System.out.print(this);
        Thing thing = null;
        switch (hand) {
            case LEFT_HAND -> {
                System.out.print(" левой рукой");
                thing = inHands.inLeftHand;
            }
            case RIGHT_HAND -> {
                System.out.print(" правой рукой");
                thing = inHands.inRightHand;
            }
        }
        System.out.println(" с размаху ударил " + thing + "ом " +
                target + " " + targetBodyPart);

        if (thing instanceof Tray) {
            ShortSound.playSound(Sounds.SHEET_METAL);
        }
    }

    @Override
    public void snatch(Thing thing, Hand hand, Person owner) {
        if (owner instanceof Foreigner) {
            Foreigner foreigner = (Foreigner) owner;
            foreigner.removeItem(thing);
            switch (hand) {
                case LEFT_HAND -> {
                    this.inHands.inLeftHand = thing;
                    System.out.print("Левой рукой ");
                }
                case RIGHT_HAND -> this.inHands.inRightHand = thing;
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
