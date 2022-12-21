package lab_02;

import java.util.Scanner;

public class Lab0203 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height (m) : ");
        float height = scanner.nextFloat();

        System.out.print("Please enter your weight (kg) : ");
        float weight = scanner.nextFloat();

        float bmi = weight / (height * 2);

        if(bmi <= 18.5) {
            System.out.printf("BMI is %.2f ---> Underweight\n", bmi);
            System.out.println("Please gain your weight!");
        } else if(bmi < 25) {
            System.out.printf("BMI is %.2f ---> Normal weight\n", bmi);
            System.out.println("Please keep your weight!");
        } else if(bmi < 30) {
            System.out.printf("BMI is %.2f ---> Overweight\n", bmi);
            System.out.println("Please lose your weight!");
        } else {
            System.out.printf("BMI is %.2f ---> Obesity\n", bmi);
            System.out.println("Please lose your weight as soon as possible!");
        }
    }
}