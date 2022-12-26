package entities.persons;
import locations.*;
import entities.Entity;
import entities.things.*;

public abstract class AbstractPerson extends Entity implements IPerson {
    private Emotions emotion;
    public AbstractPerson(String name, Emotions emotion) {
        super(name);
        this.emotion = emotion;
    }
    public AbstractPerson(String name) {
        super(name);
        this.emotion = Emotions.UNDEFINED;
    }

    public Emotions getEmotion() {
        return emotion;
    }
    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
    }

    public void scream(String phrase){
        System.out.println(getName() +  " вскричал: " + phrase);
    }
    public void runTo(Place location) {

    }
    public void runAfter(AbstractPerson person) {

    }
    public void fallBackwardOn(Entity entity) {

    }
    public void fallInto(Tank tank) {

    }
    public void getOutOf(Thing thing) {

    }
}
