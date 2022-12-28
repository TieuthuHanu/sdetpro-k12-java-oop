package lab_11;

public class Tiger extends Animal {

    private final int MAX_SPEED = 100;

    Tiger(String name) {
        super(name);
        canFlyOrNot = new FlyNoWay();
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
