package lab_03;

public class Lab0303 {

    public static void main(String[] args) {

        int[] array = {12, 34, 1, 16, 28};

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
