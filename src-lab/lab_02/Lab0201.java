package lab_02;

import java.util.Scanner;

public class Lab0201 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height (m) : ");
        double height = scanner.nextDouble();

        System.out.print("Please enter your weight (kg) : ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * 2);

        if(bmi <= 18.5) {
            System.out.printf("BMI is %.2f ---> Underweight\n", bmi);
        } else if(bmi < 25) {
            System.out.printf("BMI is %.2f ---> Normal weight\n", bmi);
        } else if(bmi < 30) {
            System.out.printf("BMI is %.2f ---> Overweight\n", bmi);
        } else {
            System.out.printf("BMI is %.2f ---> Obesity\n", bmi);
        }
    }
}
