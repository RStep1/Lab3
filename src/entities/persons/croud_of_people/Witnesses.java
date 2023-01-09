package entities.persons.croud_of_people;

import events.DisappearanceOfBandits;
import locations.Place;

public class Witnesses extends People {
    private final String atWhatEvent;
    private final Place placeOfEvent;
    public Witnesses(String name, String atWhatEvent, Place placeOfEvent) {
        super(name);
        this.atWhatEvent = atWhatEvent;
        this.placeOfEvent = placeOfEvent;
    }
    public String getAtWhatEvent() {
        return atWhatEvent;
    }

    public void tellEvent() {
        System.out.println(getName() + " при " + getAtWhatEvent() +
                " в " + placeOfEvent + " рассказывали, что будто бы");
        DisappearanceOfBandits.simulateEvent();
    }
}
