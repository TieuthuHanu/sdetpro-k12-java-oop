package lab_11;

public class Falcon extends Animal {

    private final int MAX_SPEED = 40;

    Falcon(String name) {
        super(name);
        canFlyOrNot = new CanFly();
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
