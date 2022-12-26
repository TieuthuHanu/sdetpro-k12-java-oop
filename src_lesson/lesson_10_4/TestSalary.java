package lesson_10_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {
        Employee mi1 = new Employee("Nhu", 60);
        Employee mi2 = new Employee("Nhu", 40);
        Employee mi3 = new Employee("Nhu", 50);

        List<Employee> employees = Arrays.asList(mi1, mi2, mi3);

        System.out.println("BEFORE=====");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("AFTER=====");
        System.out.println(employees);
    }
}
