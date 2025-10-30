
import java.util.ArrayList;
import java.util.List;

public class combs {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Backtrack(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    public void Backtrack(int n, int k, int index, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == k) { // base case for combination
            res.add(new ArrayList<>(temp));
            return;
        }
        // if index goes beyond n there are no more elements to consider
        if (index > n) {
            return;
        }
        temp.add(index);
        Backtrack(n, k, index + 1, temp, res);
        temp.remove(temp.size() - 1);
        Backtrack(n, k, index + 1, temp, res);
    }

    public static void main(String[] args) {
        combs c = new combs();
        int n[] = { 4, 1 };
        int k = 2;
        for (int i = 0; i < n.length; i++) {
            System.err.println(c.combine(n[i], k));
        }
    }
}
