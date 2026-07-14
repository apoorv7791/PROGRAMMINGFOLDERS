// return the first non repeating element

import java.util.Arrays;
import java.util.HashMap;

public class Non {
    void main() {
        int nums[] = { 4, 5, 1, 2, 0, 4, 5, 1, 2 };
        var map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                System.out.println("first non repeated character: " + num);
            }
        }
        System.out.println("Freqeuncies of elements " + map);
        System.out.println("Array: " + Arrays.toString(nums));

    }
}

// nums = [4, 5, 1, 2, 0, 4, 5, 1, 2]
// map = {}
// nums[0] = 4 -> = {4:1}
// nums[1] = 5 -> = {5:1}

// nums[2] = 1 -> = {1:1}
// nums[3] = 2 -> = {2:1}
// nums[4] = 0 -> = {0:1}
// nums[5] = 4 -> = {4:2}
// nums[6] = 5 -> = {5:2}
// nums[7] = 1 -> = {1:2}
// nums[8] = 2 -> = {2:2}
// if map.get(nums[i]) == 1 -> 0 is the first non repeated character