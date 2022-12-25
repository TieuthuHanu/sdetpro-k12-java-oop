package lesson_07;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat meoBattery = new BatteryRobotCat("Doreamon Battery", "01/01/1988");
        RobotCat meoSolar = new SolarRobotCat("Doreamon Solar", "01/01/1988");

        System.out.println(meoBattery);
        System.out.println(meoSolar);

        System.out.println(meoBattery.charge());
        System.out.println(meoSolar.charge());
    }
}
