package lab_0702;

import java.security.SecureRandom;

public class Animal {

    private String name;
    private int speed;

    public Animal(String name, int maxSpeed) {
        this.name = name;
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
