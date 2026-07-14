//An array contains 10 integer values, array might contain repeated value. 
//Output should be an array with no repeated values. [Array_with_no_repetation.java]

import java.util.Arrays;
import java.util.HashSet;

public class placement5 {
    public static void main(String[] args) {
        Integer[] array = { 6, 2, 3, 4, 5, 6, 8, 9, 10, 10 };
        var set = new HashSet<Integer>();
        for (var i : array) {
            if (set.contains(i)) {
                continue;
            } else {
                set.add(i);
            }
        }
        System.out.println("Array with no repeated values: " + Arrays.toString(set.toArray()));
    }
}