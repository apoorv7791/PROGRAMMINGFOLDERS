import java.util.List;
import java.util.ArrayList;

class subsets {
    public List<List<Integer>> Subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    public void Backtrack(int[] nums, int index, List<Integer> temp, List<List<Integer>> res) {
        res.add(new ArrayList<>(temp)); // add the current subset to the result
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]); // include nums[i] in the current subset
            Backtrack(nums, i + 1, temp, res); // move to the next element
            temp.remove(temp.size() - 1); // backtrack and remove the last element
        }
    }

    public static void main(String[] args) {
        subsets s = new subsets();
        int[] nums = { 1, 2, 3 };
        System.out.println(s.Subsets(nums)); // Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
    }
}