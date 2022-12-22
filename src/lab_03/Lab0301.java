package lab_03;

public class Lab0301 {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};

        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] % 2 == 0)
                evenNumbers++;
            else
                oddNumbers++;
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
