package entities.things;

import entities.Entity;

public class Tank extends Thing {
    private Entity whatIsInside;
    public Tank(String name, Entity whatIsInside) {
        super(name);
        this.whatIsInside = whatIsInside;
    }

    public Entity getWhatIsInside() {
        return whatIsInside;
    }
    public void setWhatIsInside(Entity entity) {
        whatIsInside = entity;
    }
}
