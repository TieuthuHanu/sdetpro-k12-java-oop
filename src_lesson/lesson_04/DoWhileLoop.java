package lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your number: ");
            int userInput = sc.nextInt();

            if (userInput == randomNumber) {
                System.out.println("WINNER!!!");
                break;
            }

            guessingTime++;

        } while (guessingTime <3);

        System.out.println("Random number is " + randomNumber);
        System.out.println("See you again!");
    }
}
