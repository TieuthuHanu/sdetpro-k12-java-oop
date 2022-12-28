package lab_11;

public class Dog extends Animal {

    private final int MAX_SPEED = 60;

    Dog(String name) {
        super(name);
        canFlyOrNot = new FlyNoWay();
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
