package events;

public enum Sounds {
    SHEET_METAL("звук металического листа"),
    WHISTLING("свист"),
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
