package entities.persons;
import locations.Place;
import entities.Entity;
import entities.things.Tank;
import entities.things.Tub;

public class Person extends Entity implements Movable, Shouting {
    private Emotions emotion;
    public Person(String name, Emotions emotion) {
        super(name);
        this.emotion = emotion;
    }
    public Person(String name) {
        super(name);
        this.emotion = Emotions.UNDEFINED;
    }

    public Emotions getEmotion() {
        return emotion;
    }
    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
        System.out.print(emotion + " ");
    }
    @Override
    public void shout(String phrase, String condition){
        System.out.println(getName() +  " вскричал " +
                condition + ": " + phrase);
    }
    @Override
    public void runTo(Place from, Place to) {
        to.addEntities(this);
        from.removeEntity(this);
        System.out.println(getName() + " побежал из " +
               from + " в " + to);
    }
    @Override
    public void fallBackward() {
        System.out.print(getName() + " повалился навзнич");
    }
    @Override
    public void fallInto(Tank tank) {
        if (tank instanceof Tub) {
            Tub tub = (Tub) tank;
            System.out.print("сел в " + tub);
            tub.setWhatIsInside(this);
        }
    }
    @Override
    public void getOutOf(Tank tank) {
        tank.setWhatIsInside(null);
        System.out.println(getName() + " выбрался из " + tank);
    }
    @Override
    public String toString() {
        return getName();
    }
}
