package events;

public enum Sounds {
    SHEET_METAL("такой звук, какой бывает, когда с грузовика " +
            "сбрасывают на землю листовое железо"),
    WHISTLING("свист"),
    SCREAM("крик"),
    GLASS_CHIME("звон стекла");
    private final String name;
    private Sounds(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
