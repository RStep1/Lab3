package entities.persons.croud_of_people;

import entities.persons.AbstractPerson;
import entities.persons.Emotions;
import entities.things.Thing;
import locations.*;

public class Croud extends People implements ICroud {
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
    public void scream(Emotions emotion) {
        System.out.println(getName() + " подняла " + emotion + " крик\n");
    }
    @Override
    public void crash(AbstractPerson abstractPerson) {
        System.out.println("смянает " + abstractPerson.getName() + "\n");
    }
    @Override
    public void strike(Thing thing) {

    }


}
