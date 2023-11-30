package bg.smg;

public class Vegetable extends Food{
    private boolean isFresh;

    public Vegetable() {
        isFresh = false;
    }

    public Vegetable(String name, double kg, boolean isReadyToEat) {
        super(name, kg);
        this.isFresh = isReadyToEat;
    }
}
