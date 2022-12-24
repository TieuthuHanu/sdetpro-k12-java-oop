package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(116, "Something else"); // Replace "Others"

        System.out.println(emergencyList.get(113)); // Canh sat
        System.out.println(emergencyList.get(117)); // null
        System.out.println(emergencyList.get(116)); // Something else

        for (int key: emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

        System.out.println(emergencyList.containsKey(113)); // true
        System.out.println(emergencyList.containsKey(117)); // false
        System.out.println(emergencyList.containsValue("Canh sat"));  // true
        System.out.println(emergencyList.containsValue("Canh sat ")); // false

        // Update
        emergencyList.replace(116, "116");
        System.out.println(emergencyList.get(116)); // 116

        emergencyList.replace(116, "116 ", "Update!");
        System.out.println(emergencyList.get(116)); // 116

        System.out.println(emergencyList.remove(117)); // null
        System.out.println(emergencyList.remove(115)); // Cap cuu
    }
}
