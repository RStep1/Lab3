package entities;

public abstract class Entity {
    private String name;
    public Entity(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass())
            return false;
        Entity other = (Entity) otherObject;
        return name.equals(other.name);
    }
    @Override
    public String toString() {
        return this.name;
    }
}
