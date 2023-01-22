package entities.persons.croud_of_people;

import entities.persons.Person;
import entities.persons.Emotions;
import events.ShortSound;
import events.Sounds;
import locations.*;
import entities.persons.Screaming;

public class Croud extends People implements Demolishing, Screaming {
    private Emotions emotion;
    public Croud(String name, Emotions emotion) {
        super(name);
        this.emotion = emotion;
    }
    public Croud(String name) {
        super(name);
        this.emotion = Emotions.UNDEFINED;
    }

    public Emotions getEmotion() {
        return emotion;
    }
    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
    }

    @Override
    public void scream() {
        ShortSound.playSound(Sounds.SCREAM);
        System.out.println((getEmotion() == Emotions.UNDEFINED ? "" : getEmotion() + " ")
                + getName());
    }
    @Override
    public void crash(Person person) {
        System.out.println("смянает " + person.getName());
    }
    @Override
    public void dislodge(GlassDoor glassDoor) {
        glassDoor.setBroken(true);
        System.out.println("\n" + getName() + " выдавили стекла в " + glassDoor);
    }


}
