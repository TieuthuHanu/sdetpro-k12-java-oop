package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int userInput = sc.nextInt();

        switch (userInput) {
            case 0:
                System.out.println("Giai dac biet!"); break;
            case 1:
                System.out.println("Giai nhat!"); break;
            case 2:
                System.out.println("Giai nhi!"); break;
            case 3:
                System.out.println("Giai ba!"); break;
            default:
                System.out.println("Haha!!!");
        }

        switch (userInput) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Go to work!"); break;
            case 7:
            case 8:
                System.out.println("Go shopping!"); break;
            default:
                System.out.println("Only 2 - 8");
        }
    }
}