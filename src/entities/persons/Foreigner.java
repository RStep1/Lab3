package entities.persons;

import entities.things.Thing;

public class Foreigner extends AbstractPerson {
    private Thing heardress;
    private Thing dousedWith;
    public Foreigner(String name, Emotions emotion, Thing heardress) {
        super(name, emotion);
        this.heardress = heardress;
    }

}
