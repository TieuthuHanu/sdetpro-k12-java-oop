package lesson_02;

public class OperatorLearning {

    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        // Right operand
        int total = myNum1 + myNum2;
        System.out.println("Total: " + total);

        // Total is %d: int, %f: float, %b: boolean, %s: string
        System.out.printf("Total is %f\n", 3.14f);
        System.out.printf("Boolean value is %b\n", true);
        System.out.printf("Character is %s\n", 'a');

        float myFloatNum = 3/2f;
        System.out.println(myFloatNum);

        System.out.println(5/2);
        System.out.println(5%2);
    }
}
