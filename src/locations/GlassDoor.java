package locations;

import events.ShortSound;
import events.Sounds;

public class GlassDoor extends Place {
    private boolean isGlassBroken;
    public GlassDoor(String name, boolean isBroken) {
        super(name);
        this.isGlassBroken = isBroken;
    }

    public boolean isItBroken() {
        return isGlassBroken;
    }

    public void setBroken(boolean isBroken) {
        if (!this.isGlassBroken && isBroken)
            ShortSound.playSound(Sounds.GLASS_CHIME);
        this.isGlassBroken = isBroken;
    }
}
