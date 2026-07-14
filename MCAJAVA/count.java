import java.util.*;

class Main {

    public static void main(String[] args) {

        int nums[] = {1, 1, 2, 3, 4, 5, 7, 8, 9, 10, 10, 11};

        var map = new HashMap<Integer, Integer>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // print frequency map
        System.out.println(map);

        // print duplicates only
        for(var entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}