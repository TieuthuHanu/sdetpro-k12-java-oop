package lab_0701;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        Employee nhu1 = new FullTimeEmployee();
        Employee nhu2 = new FullTimeEmployee();
        Employee nhu3 = new FullTimeEmployee();
        Employee nhu4 = new ContractorEmployee();
        Employee nhu5 = new ContractorEmployee();

        System.out.println(controller.totalSalary(Arrays.asList(nhu1, nhu2, nhu3, nhu4, nhu5)));
    }
}
