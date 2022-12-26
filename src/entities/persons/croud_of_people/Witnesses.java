package entities.persons.croud_of_people;

import events.DisappearanceOfBandits;

public class Witnesses extends People {
    private String atWhatEvent;
    public Witnesses(String name, String atWhatEvent) {
        super(name);
        this.atWhatEvent = atWhatEvent;
    }
    public String getAtWhatEvent() {
        return atWhatEvent;
    }

    public void tellEvent() {
        System.out.println(getName() + " при " + getAtWhatEvent() + " рассказывали, что будто бы\n");
        DisappearanceOfBandits.simulateEvent();
    }
}
