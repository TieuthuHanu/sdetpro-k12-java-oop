package lab_11;

public class CanFly implements Flyable {

    @Override
    public boolean flyableInterface() {
        return true;
    }

    @Override
    public String toString() {
        return "Can Fly";
    }
}
