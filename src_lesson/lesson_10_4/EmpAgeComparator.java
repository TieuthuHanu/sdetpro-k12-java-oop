package lesson_10_4;

import java.util.Comparator;

public class EmpAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getAge(), e2.getAge());

//        return e1.getAge() < e2.getAge() ? -1 : (e1.getAge() == e2.getAge() ? 0 : 1);

//        if (e1.getAge() < e2.getAge())
//            return -1;
//        else if (e1.getAge() == e2.getAge())
//            return 0;
//        else
//            return 1;
    }
}
