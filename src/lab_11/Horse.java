package lab_11;

public class Horse extends Animal {

    private final int MAX_SPEED = 75;

    Horse(String name) {
        super(name);
        canFlyOrNot = new FlyNoWay();
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
