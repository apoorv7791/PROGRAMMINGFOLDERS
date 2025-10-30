//An array contains 10 integer values, array might contain repeated value. 
//Output should be an array with no repeated values. [Array_with_no_repetation.java]

import java.util.Arrays;

public class placement5 {
    public static void main(String[] args) {
        Integer[] array = { 6, 2, 3, 4, 5, 6, 8, 9, 10, 10 };
        Arrays.sort(array);
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                newArray[j++] = array[i];
            }
        }
        newArray[j] = array[array.length - 1];
        System.out.println("Array with no repeated values: " + Arrays.toString(newArray));
    }
}