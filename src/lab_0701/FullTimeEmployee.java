package lab_0701;

public class FullTimeEmployee extends Employee {

    private double fullTimeSalary;
    private int numberOfFullTimeEmployee;

    public double getFullTimeSalary() {
        return fullTimeSalary;
    }

    public void setFullTimeSalary(double fullTimeSalary) {
        this.fullTimeSalary = fullTimeSalary;
    }

    public int getNumberOfFullTimeEmployee() {
        return numberOfFullTimeEmployee;
    }

    public void setNumberOfFullTimeEmployee(int numberOfFullTimeEmployee) {
        this.numberOfFullTimeEmployee = numberOfFullTimeEmployee;
    }
}
