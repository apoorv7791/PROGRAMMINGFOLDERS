public class Solution {
    void isjudgeColor(int[] nums) {
        var i = 0;
        var j = 0;
        var k = nums.length - 1;
        while (j <= k) {
            if (nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[j] == 1) {
                j++;
            } else {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }
        }
    }

    void main() {
        Solution s = new Solution();
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        s.isjudgeColor(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
}