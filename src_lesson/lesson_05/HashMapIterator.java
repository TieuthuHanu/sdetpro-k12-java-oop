package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");

        for (Integer key: emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Others"))
                emergencyList.replace(key, "Something else!"); // if remove, will be error -> Iterator
        }

        for (Integer key: emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}
