package lab_11;

public class FlyNoWay implements Flyable {

    @Override
    public boolean flyableInterface() {
        return false;
    }

    @Override
    public String toString() {
        return "No Fly";
    }
}
