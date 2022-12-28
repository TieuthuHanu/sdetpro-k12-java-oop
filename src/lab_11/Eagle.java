package lab_11;

public class Eagle extends Animal {

    private final int MAX_SPEED = 60;

    Eagle(String name) {
        super(name);
        canFlyOrNot = new CanFly();
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
