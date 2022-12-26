package lab_09;

public abstract class EmployeeWithAbstract {

    private int salary;

    public EmployeeWithAbstract() {
    }

    public abstract int getSalary();

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
