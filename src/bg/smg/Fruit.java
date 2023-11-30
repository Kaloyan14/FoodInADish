package bg.smg;

public class Fruit extends Food{
    private boolean isReadyToEat;

    public Fruit() {
        isReadyToEat = false;
    }

    public Fruit(String name, double kg, boolean isReadyToEat) {
        super(name, kg);
        this.isReadyToEat = isReadyToEat;
    }
}
