// Given an integer array nums and an integer target return the two indicies such that they add up to the target 
// you can only use one element at a time 
// Example : nums = [2, 7, 11, 15], target = 9
// output : [0, 1] because the two indices nums[0] = 2 + nums[1] = 7 gives the output: 9

import java.util.*;
class TwoSum{
    public int[] TwoSumPair(int[] nums, int target){
	int n = nums.length;
	for(int i = 0; i < n; i++){
           for(int j = i + 1; j < n; j++){
		if (nums[i] + nums[j] == target){
			return new int[]{i, j};
		}
	      }
	}
	return new int[]{};
    }
    public static void main(String args[]){
	var ts = new TwoSum();
	int nums[] = {2, 7, 11, 15};
	int target = 9;
	System.out.println(Arrays.toString(ts.TwoSumPair(nums, target)));
    }
} 


// nums = [2, 7, 11, 15], target = 9
// brute force : check every pair available and return those indices that gives us the valid ouput
// i = 0
// j = 1 -> 2 + 7 = 9
// j = 2 -> 2 + 11 = 13
// j = 3 -> 2 + 15 = 17

// i = 1
// j = 2 -> 7 + 11 = 18
// j = 3 -> 7 + 15 = 22

// i = 2
// j = 3 -> 11 + 15 = 26
// found pair : [0, 1] 
// this approach gives us the time complexity of O(n^2)
