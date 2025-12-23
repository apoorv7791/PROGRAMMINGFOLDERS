import java.util.ArrayList;
import java.util.List;

class yes {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Backtrack(nums, res, temp);
        return res;
    }
        
    public void Backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i]))
                continue;
            temp.add(nums[i]);
            Backtrack(nums, res, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        yes y = new yes();
        System.err.println(y.permute(new int[] { 1, 2, 3 }));
    }
}

// input nums = [1,2,3]
// output = [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]