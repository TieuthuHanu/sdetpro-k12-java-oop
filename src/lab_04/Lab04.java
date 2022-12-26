package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {
        printMenu();
        List<Integer> myArrayList = new ArrayList<>();
        boolean isContinuing = true;

        while (isContinuing) {
            int option = getMenuOption();

            switch (option) {
                case 1: addNumber(myArrayList); break;
                case 2: printListOfNumbers(myArrayList); break;
                case 3: maxValue(myArrayList); break;
                case 4: minValue(myArrayList); break;
                case 5: searchNumber(myArrayList); break;
                case 0: isContinuing = false; break;
                default: System.out.println("Wrong option!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("======MENU======");
        System.out.println("1. Add numbers into list");
        System.out.println("2. Print all numbers");
        System.out.println("3. Print maximum value");
        System.out.println("4. Print minimum value");
        System.out.println("5. Search number");
        System.out.println("0. Exit!");
        System.out.println("================");
    }

    public static int getMenuOption() {
        System.out.print("Please select an option: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void addNumber(List<Integer> arrayList) {
        int number = new SecureRandom().nextInt(1000);
        arrayList.add(number);
        System.out.println(number);
    }

    public static void printListOfNumbers(List<Integer> arrayList) {
        System.out.println(arrayList);
    }

    public static void maxValue(List<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int index = 1; index < arrayList.size(); index++) {
            if (arrayList.get(index) > max)
                max = arrayList.get(index);
        }
        System.out.println(max);
    }

    public static void minValue(List<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int index = 1; index < arrayList.size(); index++) {
            if (arrayList.get(index) < min)
                min = arrayList.get(index);
        }
        System.out.println(min);
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