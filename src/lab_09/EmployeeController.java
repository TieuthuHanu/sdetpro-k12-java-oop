package lab_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public int totalSalary(List<EmployeeWithAbstract> employeeList) {
        int totalSalary = 0;
        for (EmployeeWithAbstract employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        EmployeeWithAbstract nhu1 = new FullTimeEmployeeWithAbstract();
        EmployeeWithAbstract nhu2 = new FullTimeEmployeeWithAbstract();
        EmployeeWithAbstract nhu3 = new FullTimeEmployeeWithAbstract();
        EmployeeWithAbstract nhu4 = new ContractorEmployeeWithAbstract();
        EmployeeWithAbstract nhu5 = new ContractorEmployeeWithAbstract();

        System.out.println(controller.totalSalary(Arrays.asList(nhu1, nhu2, nhu3, nhu4, nhu5)));
    }
}
