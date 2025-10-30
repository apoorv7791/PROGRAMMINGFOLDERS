public class Binary {
    public static int Search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                mid = left + 1;
            } else {
                mid = right - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15, 23 };
        int target = 8;
        int result = Search(nums, target);
        System.out.println(result);
    }
}
