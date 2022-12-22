package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {

        boolean isContinuing = true;

        while (isContinuing) {
            System.out.println("======Game Menu======");
            System.out.println("1. Generate random number (less than 1000)");
            System.out.println("0. Exit!");

            Scanner sc = new Scanner(System.in);
            System.out.print("Please select option: ");
            int option = sc.nextInt();

            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.println("Your random number: " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("Wrong input");
            }
        }

        System.out.println("See you again!!!");
    }
}
