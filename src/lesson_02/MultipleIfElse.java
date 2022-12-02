package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {
        // <18 | 18-55 | >55
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age < 18) {
            System.out.println("Khong ban!");
            if(age < 12) {
                System.out.println("Report 911...");
            }
        } else if(age <= 55) {
            System.out.println("Unlimited");
        } else {
            System.out.println("2 chai!!");
        }
    }
}
