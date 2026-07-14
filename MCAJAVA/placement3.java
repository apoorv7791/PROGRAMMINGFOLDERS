// 	An array (Integer) contains 6 values, write a java program to check if any of the value of repeated in an array or not?

import java.util.*;

public class placement3 {
    public static void main(String[] args) {
        Integer[] array = { 6, 2, 3, 4, 5, 6, 8, 9, 10 };
        var map = new HashMap<Integer, Integer>();
        for (int i : array) {
            if (map.containsKey(i)) {
                System.out.println("Element found occuring twice " + i);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println("final map: " + map);
    }
}
