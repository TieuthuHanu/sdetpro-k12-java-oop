package lesson_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDataFactory {

    public static void main(String[] args) {

        // READING
        // Macbook: /src_lesson/lesson_13/Persons.txt
        // Windows: \\src_lesson\\lesson_13\\Persons.txt
        String relativeFilePath = "/src_lesson/lesson_13/Persons.txt";
        String absoluteFilePath = System.getProperty("user.dir") + relativeFilePath;

        List<Employee> employeeListIn = DataFactory.getEmployeeListFromFile(absoluteFilePath);
        Collections.sort(employeeListIn);
        System.out.println(employeeListIn);

        // WRITING
        Employee nhu = new Employee("Nhu", 30, 100000);
        Employee michelle = new Employee("Mi Cheo", 31, 200000);
        Employee jennifer = new Employee("Pho", 32, 150000);
        List<Employee> employeeListOut = Arrays.asList(nhu, michelle, jennifer);
        String employeeDBFile = System.getProperty("user.dir") + "/src_lesson/lesson_13/EmployeeDB.txt";
        DataFactory.saveEmployeeList(employeeListOut, employeeDBFile);
    }
}
