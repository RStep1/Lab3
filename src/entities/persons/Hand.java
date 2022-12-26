package entities.persons;

public enum Hand {
    LEFT_HAND("левая рука"),
    RIGHT_HAND("правая рука");
    private final String description;
    Hand(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
