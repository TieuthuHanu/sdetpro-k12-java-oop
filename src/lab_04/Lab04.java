package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {
        printMenu();
        int option;
        int addTimes = new SecureRandom().nextInt(10);

        List<Integer> myArrayList = new ArrayList<>();

        for (int index = 0; index < addTimes; index++) {
            myArrayList.add(new SecureRandom().nextInt(1000));
        }

        do {
            System.out.print("Please select an option: ");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option) {
                case 1: System.out.println(myArrayList); break;
                case 2: System.out.println(maxValue(myArrayList)); break;
                case 3: System.out.println(minValue(myArrayList)); break;
                case 4: searchNumber(myArrayList); break;
            }
        } while (option == 1 || option == 2 || option == 3 || option == 4);
    }

    public static void printMenu() {
        System.out.println("======MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("================");
    }

    public static int maxValue(List<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int index = 1; index < arrayList.size(); index++) {
            if (arrayList.get(index) > max)
                max = arrayList.get(index);
        }
        return max;
    }

    public static int minValue(List<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int index = 1; index < arrayList.size(); index++) {
            if (arrayList.get(index) < min)
                min = arrayList.get(index);
        }
        return min;
    }

    public static void searchNumber(List<Integer> arrayList) {
        System.out.print("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (arrayList.contains(number))
            System.out.println(arrayList.indexOf(number));
        else System.out.println("Number is not in the list!");
    }
}