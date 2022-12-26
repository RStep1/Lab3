package locations;

import entities.Entity;

public interface IPlace {
    void addSubplaces(Place... places);
    void addEntities(Entity... entities);
    void moveEntity(Entity entity, Place newPlace);
}
