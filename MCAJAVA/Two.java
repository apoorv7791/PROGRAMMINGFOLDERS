// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

import java.util.HashMap;

public class Two {
    public int[] TwoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = new Two().TwoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)
// optimized
// use a hashmap
// time complexity: O(n)
// space complexity: O(1)

// dry run
// nums = [2, 7, 11, 15]
// target = 9;
// map = {}
// nums[0] = 2
// compliment = target - nums[i] = 9 - 2 = 7 , 7 in map ? no -> map = {7: 1}
// nums[1] = 2 target - nums[i] = 9 - 7 = 2 , 7 in the map yes -> {2: 0, 7: 1}
