package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4); // CANNOT add/remove elements but update
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(4);

//        for (int index = 0; index < arrayList.size(); index++) {
//            boolean isOdd = arrayList.get(index) % 2 != 0;
//            if (isOdd) {
//                arrayList.set(index, arrayList.get(index) + 1);
//            }
//        }
//        System.out.println(arrayList);

        arrayList2.remove(1);
        arrayList2.remove(new Integer(1));
        System.out.println(arrayList2);

        // isEmpty
        if (!arrayList2.isEmpty()) {
            System.out.println("List size is " + arrayList2.size());
        }

        // Check element exist
        System.out.println(arrayList2.contains(1)); // false
        System.out.println(arrayList2.contains(4)); // true
        System.out.println(arrayList2.indexOf(4));  // 1
    }
}