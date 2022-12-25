package lab_0701;

public class ContractEmployee extends Employee {

    private double contractSalary;
    private int numberOfContractEmployee;

    public double getContractSalary() {
        return contractSalary;
    }

    public void setContractSalary(double contractSalary) {
        this.contractSalary = contractSalary;
    }

    public int getNumberOfContractEmployee() {
        return numberOfContractEmployee;
    }

    public void setNumberOfContractEmployee(int numberOfContractEmployee) {
        this.numberOfContractEmployee = numberOfContractEmployee;
    }
}
