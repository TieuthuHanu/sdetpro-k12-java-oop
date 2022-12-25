package lesson_07;

import java.util.Arrays;
import java.util.List;

public class RobotController {

    public static void main(String[] args) {
        RobotController controller = new RobotController();
        RobotCat meoBattery = new BatteryRobotCat("Doreamon Battery", "01/01/1988");
        RobotCat meoSolar = new SolarRobotCat("Doreamon Solar", "01/01/1988");

        controller.charge(Arrays.asList(meoBattery, meoSolar));
    }

    // Controller | IS-A relationship
    public void charge(List<RobotCat> robotCatList) {
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}
