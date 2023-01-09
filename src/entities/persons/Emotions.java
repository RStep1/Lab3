package entities.persons;

public enum Emotions {
    SHOCKED("потрясенный"),
    EXCITED("взволнованный"),
    DESPERATE("отчаянный"),
    TURNS_WHITE("Белея,"),
    UNDEFINED("неопределенная");
    private final String description;
    Emotions(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
