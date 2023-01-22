package locations;

import entities.Entity;

public interface Placeable {
    void addSubplaces(Place... places);
    void addEntities(Entity... entities);
    boolean removeEntity(Entity entity);
}
