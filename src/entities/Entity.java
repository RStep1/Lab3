package entities;

public class Entity implements Cloneable{
    private String name;
    public Entity(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public Entity clone() throws CloneNotSupportedException {
        Entity cloned = (Entity) super.clone();
        cloned.name = this.name;
        return cloned;
    }
}
