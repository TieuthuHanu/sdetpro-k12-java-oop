package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person nhu = new Person();
        nhu.setName("Nhu");
        nhu.setAge(34);

        personList.add(nhu);
        personList.add(nhu);

        System.out.println(personList);

        personList.get(1).setName("Michelle"); // change both Nhu to Michelle (reference to Person nhu = new Person();)
        System.out.println(personList);
    }
}
