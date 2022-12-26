package entities.things;

public class Tray extends Thing {
    private Thing thingOn;
    public Tray(String name, Thing thingOn) {
        super(name);
        this.thingOn = thingOn;
    }
    public Thing getThingOn() {
        return thingOn;
    }
    public void setThingOn(Thing thing) {
        this.thingOn = thingOn;
    }
}
