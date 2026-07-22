// Given an integer array nums and an integer target return the two indicies such that they add up to the target 
// you can only use one element at a time 
// Example : nums = [2, 7, 11, 15], target = 9
// output : [0, 1] because the two indices nums[0] = 2 + nums[1] = 7 gives the output: 9

import java.util.*;
class TwoSum{
    public int[] TwoSumPair(int[] nums, int target){
	int n = nums.length;
	var map = new HashMap<Integer, Integer>();
	for(int i = 0; i < n; i++){
		int compliment = target - nums[i];
		if (map.containsKey(compliment)){
			return new int[]{map.get(compliment), i};
		} 
		map.put(nums[i], i);
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
// map = {};
// 
// this approach gives us the time complexity of O(n^2)
