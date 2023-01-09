package entities.things;
import entities.Entity;

public class Tub extends Tank {
    public Tub(String name, Entity whatIsInside) {
        super(name, whatIsInside);
    }
    private void splashOut() {
        System.out.println(", выбивается " + getWhatIsInside() +
                " из " + this);
        super.setWhatIsInside(null);
    }

    @Override
    public void setWhatIsInside(Entity entity) {
        if (getWhatIsInside() != null && entity != null) {
            splashOut();
        }
        super.setWhatIsInside(entity);
    }
}
