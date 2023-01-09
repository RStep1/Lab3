package locations;

import entities.things.Thing;

public class Windows extends Place {
    private Thing curtains;
    public Windows(String name, Thing curtains) {
        super(name);
        this.curtains = curtains;
    }
    public Thing getCurtains() {
        return curtains;
    }
}
