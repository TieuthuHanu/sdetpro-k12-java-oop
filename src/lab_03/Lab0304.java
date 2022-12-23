package lab_03;

public class Lab0304 {

    public static void main(String[] args) {

        int[] array1 = {1, 12, 16, 28, 34};
        int[] array2 = {1, 13, 16, 27, 99};
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j])
                mergedArray[k++] = array1[i++];
            else
                mergedArray[k++] = array2[j++];
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        for (int value: mergedArray) {
            System.out.print(value + " ");
        }
    }
}
