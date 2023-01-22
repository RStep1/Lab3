package entities.persons;

import events.Sounds;

public class Porter extends Person implements Whistling {
    public Porter(String name) {
        super(name);
    }

    public void finishWhistle() {
        System.out.print("Прекратился " +
                Sounds.WHISTLING + " " + getName() + "а");
    }
}
