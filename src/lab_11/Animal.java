package lab_11;

import java.security.SecureRandom;

public abstract class Animal {

    Flyable canFlyOrNot;
    private String name;
    private int speed;

    public Animal(String name) {
        this.name = name;
        this.speed = new SecureRandom().nextInt(getMaxSpeed());
    }

    boolean flyable() {
        return canFlyOrNot.flyableInterface();
    }

    public abstract int getMaxSpeed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "canFlyOrNot=" + canFlyOrNot +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
