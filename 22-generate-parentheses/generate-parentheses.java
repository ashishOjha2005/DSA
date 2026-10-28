
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n, "", 0, 0, ans);
        return ans;
    }

    public void solve(int n, String s, int open, int close, List<String> ans) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n) {
            solve(n, s + "(", open + 1, close, ans);
        }

        if (close < open) {
            solve(n, s + ")", open, close + 1, ans);
        }
    }
}
