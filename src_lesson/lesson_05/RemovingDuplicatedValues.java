package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(7);
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(3);

        /*
        * Lay 3 gia tri nho nhat khac nhau
        *
        * */
        List<Integer> noDuplicateList = new ArrayList<>();
        for (Integer number: myArrayList) {
            if (!noDuplicateList.contains(number))
                noDuplicateList.add(number);
        }

        System.out.println(myArrayList);
        Collections.sort(noDuplicateList);
        System.out.println(noDuplicateList);

        // Set : no duplicate elements, sorted
        Set<Integer> set = new HashSet<>(myArrayList);
        myArrayList = new ArrayList<>(set);
        System.out.println(myArrayList);

        // Sublist
        List<Integer> first3MinValues = noDuplicateList.subList(0, 3);
        System.out.println(first3MinValues);
    }
}
