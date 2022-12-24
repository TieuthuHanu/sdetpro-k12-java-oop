package lesson_06;

public class Calculator {

    public int sum(int... restNumbers) {
        int sum = 0;
        for (int number : restNumbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator total = new Calculator();
        System.out.println(total.sum(1, 2, 3, 4));
    }
}
