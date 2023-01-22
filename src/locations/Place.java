package locations;

import entities.Flammable;
import entities.Entity;
import entities.things.Liquid;

import java.util.ArrayList;

public class Place implements Placeable, Flammable {
    private String name;
    private Liquid dousedWith;
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

    public String getName() {
        return name;
    }

    public Liquid getDousedWith() {
        return dousedWith;
    }
    public void setDousedWith(Liquid liquid) {
        this.dousedWith = liquid;
    }

    @Override
    public void addSubplaces(Place... subplaces) {
        for (Place subplace : subplaces) {
            this.subplaces.add(subplace);
        }
    }

    @Override
    public void addEntities(Entity... entities) {
        for (Entity entity : entities) {
            this.entities.add(entity);
        }
    }

    @Override
    public boolean removeEntity(Entity summon) {
        for (Entity entity : entities) {
            if (summon.equals(entity)) {
                entities.remove(summon);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Place> getSubplaces() {
        return this.subplaces;
    }
    public ArrayList<Entity> getEntities() {
        return this.entities;
    }

    @Override
    public void inflame(String condition) {
        if (!dousedWith.isCanBurn()) {
            System.out.println("вспыхивает " + condition + " " + getName());
        }
    }

    @Override
    public String toString() {
        return name;
    }

}

