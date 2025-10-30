import java.util.ArrayList;
import java.util.List;

class paren {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, "", 0, 0, res);
        return res;
    }

    private void dfs(int n, String current, int open, int close, List<String> res) {
        if (open == n && close == n) {
            res.add(current);
            return;
        }
        if (open < n)
            dfs(n, current + "(", open + 1, close, res);
        if (close < open)
            dfs(n, current + ")", open, close + 1, res);
    }

    public static void main(String[] args) {
        int n = 3;
        paren p = new paren();
        List<String> res = p.generateParenthesis(n);
        for (String s : res) {
            System.out.println(s);
        }
    }
}