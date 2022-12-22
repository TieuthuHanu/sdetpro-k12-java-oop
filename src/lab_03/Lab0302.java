package lab_03;

public class Lab0302 {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};

        int min = intArr[0];
        int max = intArr[0];

        for (int index = 1; index < intArr.length; index++) {
            if (intArr[index] < min)
                min = intArr[index];
            else if (intArr[index] > max)
                max = intArr[index];
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
