package entities.persons;

import events.ShortSound;
import events.Sounds;

public class Porter extends AbstractPerson implements IPorter{
    public Porter(String name) {
        super(name);
    }

    public void startWhistle() {
        System.out.println();
    }
    public void finishWhistle() {
        System.out.println(getName() + " заканчивается");
        ShortSound.playSound(Sounds.WHISTLING);
        System.out.println("\n");
    }


}
