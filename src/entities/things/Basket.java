package entities.things;

public class Basket extends Tank {
    private Thing thingOn;
    public Basket(String name, Thing thing, Thing thingOn) {
        super(name, thing);
        this.thingOn = thingOn;
    }
    public Thing getThingOn() {
        return thingOn;
    }
}
