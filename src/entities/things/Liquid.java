package entities.things;

public class Liquid extends Thing {
    private final boolean canBurn;
    public Liquid(String name, boolean canBurn) {
        super(name);
        this.canBurn = canBurn;
    }

    public boolean isCanBurn() {
        return canBurn;
    }
}
