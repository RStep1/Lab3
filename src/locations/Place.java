package locations;

import entities.Burning;
import entities.Entity;

import java.sql.Array;
import java.util.ArrayList;

public class Place implements IPlace, Cloneable {
    private String name;
    private Place superplace = null;
    private ArrayList<Place> subplaces = new ArrayList<>();
    private ArrayList<Entity> entities = new ArrayList<>();
    public Place(String name) {
        this.name = name;
    }
    public Place(Place subplace) {
        this.name = subplace.name;
        this.subplaces = new ArrayList<>(subplaces);
        this.entities = new ArrayList<>(entities);
    }

    @Override
    public void addEntities(Entity... entities) {
        for (Entity entity : entities) {
            this.entities.add(entity);
        }
    }
    @Override
    public void addSubplaces(Place... subplaces) {
        for (Place place : subplaces) {
            this.subplaces.add(place);
        }
        for (Place place : this.subplaces) { //обновляем для всех вложенных локаций ссылку на их "родителя"
            place.superplace = this;
        }
    }

    @Override
    public void moveEntity(Entity entity, Place newPlace) {

    }

    private void removeEntity(Entity entity) {

        entities.remove(entity);
    }
    public ArrayList<Place> getSubplaces() {
        //return new ArrayList<>(subplaces);
        return subplaces;
    }
    public ArrayList<Entity> getEntities() {
        return new ArrayList<>(entities);
    }
    public Place getPlace(Entity entity) throws CloneNotSupportedException {
        return this.clone();
    }
    public Place getSuperplace() throws CloneNotSupportedException {
        //return new Place(superplace);
        //return this.superplace;
        return this.superplace.clone();
    }
    @Override
    public String toString() {
        return String.format("Локация %s, Подлокации: %s, Сущности: %s",
                this.name, this.subplaces, this.entities);
    }
    @Override
    public Place clone() throws CloneNotSupportedException {
        Place cloned = (Place) super.clone();
        cloned.name = this.name;
        cloned.superplace = this.superplace.clone();
        for (Place subplace : cloned.subplaces) { // нужно клонировать все изменяемые объекты
            subplace = subplace.clone();
        }
        for (Entity entity : cloned.entities) {
            entity = entity.clone();
        }
        return cloned;
    }
}

