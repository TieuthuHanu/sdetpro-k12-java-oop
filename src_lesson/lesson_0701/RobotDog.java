package lesson_0701;

public class RobotDog {

    protected static int dogId = 0;

    public RobotDog() {
        dogId++;
    }

    public int getDogId() {
        return dogId;
    }
}
