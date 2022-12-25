package lab_06;

import java.util.Scanner;

public class Lab0602 {

    public static void main(String[] args) {
        String myPassword = "password123";
        boolean incorrectInput = true;
        int inputTimes = 0;

        while (incorrectInput && inputTimes < 3) {
            System.out.print("Please input your password: ");
            Scanner sc = new Scanner(System.in);

            // inputPassword should have letters and numbers
            String inputPassword = sc.next();

            if (myPassword.equals(inputPassword)) {
                System.out.println("Successfully Login!");
                incorrectInput = false;
            } else {
                inputTimes++;
                System.out.println("Wrong password!");
                if (inputTimes == 3)
                    System.out.println("You have reached maximum times!");
            }
        }
    }
}
