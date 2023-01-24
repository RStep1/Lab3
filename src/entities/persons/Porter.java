package entities.persons;

import events.ShortSound;
import events.Sounds;

public class Porter extends Person implements Whistling {
    public Porter(String name) {
        super(name);
    }

    @Override
    public void startWhistle() {
        System.out.print(this + " засвистел, ");
        ShortSound.playSound(Sounds.WHISTLING);
    }
    @Override
    public void finishWhistle() {
        System.out.print("Прекратился " +
                Sounds.WHISTLING + " " + getName() + "а");
    }
}
