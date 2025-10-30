// 	An array (Integer) contains 6 values, write a java program to check if any of the value of repeated in an array or not?

import java.util.Arrays;

public class placement3 {
    public static void main(String[] args) {
        Integer[] array = { 6, 2, 3, 4, 5, 6, 8, 9, 10 };
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Number " + array[i] + " is repeated");
                break;

            }
        }
    }
}
