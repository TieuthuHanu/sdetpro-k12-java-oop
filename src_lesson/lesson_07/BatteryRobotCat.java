package lesson_07;

public class BatteryRobotCat extends RobotCat {

    public BatteryRobotCat() {
    }

    public BatteryRobotCat(String name, String productionDate) {
        super(name.concat(" meo may"), productionDate);
    }

    @Override
    public String charge() {
        return super.charge() + " with battery";
    }
}
