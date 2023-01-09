package entities.persons;

import entities.things.Tray;

public interface TrayInteraction extends ThingInteraction {
    void dropThing(Tray tray);
}
