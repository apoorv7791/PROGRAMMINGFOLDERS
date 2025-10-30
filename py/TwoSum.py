# Given an integer array nums and integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.


class Solution:
    def TwoSum(self, nums, target):
        hash_map = {}  # Create an empty dictionary to store the elements and their indices
        for i in range(len(nums)):
            # Calculate the complement of the current element with the target
            complement = target - nums[i]
            if complement in hash_map: # Check if the complement is already present in the hash map
                return [hash_map[complement], i]
            hash_map[nums[i]] = i

s = Solution()
print(s.TwoSum(nums=[2, 7, 11, 15], target=9))



# output: [0, 1]

# input: [2, 7, 11, 15], 9
# output: [0, 1]


# Explanation of the solution
# We can solve this problem using a hash map to store the elements and their indices.
# We iterate over the input array and calculate the complement of the current element with the target value.
# If the complement is already present in the hash map, we return the indices of the two elements that add up to the target.
# If the complement is not present in the hash map, we add the current element to the hash map with its index.
# This way, we can find the indices of the two numbers that add up to the target value in O(n) time complexity.
# The space complexity of this solution is O(n) because we store the elements and their indices in the hash map.
# This solution is efficient and does not require sorting the input array.
# We can return the indices in any order as per the problem statement.
# The solution is implemented in the TwoSum method of the Solution class.
