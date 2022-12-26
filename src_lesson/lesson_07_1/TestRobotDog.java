package lesson_07_1;

public class TestRobotDog {

    public static void main(String[] args) {
        RobotDog dog = new CloudRobotDog();
        System.out.println(dog.getDogId()); // 1
        RobotDog dog2 = new SolarRobotDog();

        System.out.println(dog.getDogId()); // 2
        System.out.println(dog2.getDogId()); // 2
    }
}
