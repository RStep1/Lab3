package locations;

import events.ShortSound;
import events.Sounds;

public class GlassDoor extends Place {
    private boolean isBroken;
    public GlassDoor(String name, boolean isBroken) {
        super(name);
        this.isBroken = isBroken;
    }

    public boolean getIsBroken() {
        return isBroken;
    }

    public void setBroken(boolean isBroken) {
        if (!this.isBroken && isBroken)
            ShortSound.playSound(Sounds.GLASS_CHIME);
        this.isBroken = isBroken;
    }
}
