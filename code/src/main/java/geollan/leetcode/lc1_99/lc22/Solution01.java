package geollan.leetcode.lc1_99.lc22;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date: 2024/8/9 9:42
 * @Author: Geollan
 **/
public class Solution01 {
    private int n;
    private char path[];
    private List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        this.n = n;
        path = new char[n * 2];
        dfs(0, 0);

        return ans;
    }

    public void dfs(int i, int open) {
        if(i == n * 2) {
            ans.add(new String(path));
            return;
        }

        if(open < n) {
            path[i] = '(';
            dfs(i + 1, open + 1);
        }

        if(i - open < open) {
            path[i] = ')';
            dfs(i + 1, open);
        }
    }
}
