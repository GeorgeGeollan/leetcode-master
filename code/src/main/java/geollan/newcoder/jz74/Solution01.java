package geollan.newcoder.jz74;

import java.util.ArrayList;

/**
 * @Description 迭代/双指针/适合小数据量 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/18 09:44
 * @Author: Geollan
 **/
public class Solution01 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        // write code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        int total = 0;
        int left = 1, right = 1;
        while (left <= right) {
            if (total < sum) {
                total += right;
                cur.add(right);
                right++;
            }

            else if (total == sum) {
                if (cur.size() >= 2)
                    ans.add(new ArrayList<>(cur));
                cur.remove(Integer.valueOf(left));
                total -= left;
                left++;
            }

            else if (total > sum) {
                cur.remove(Integer.valueOf(left));
                total -= left;
                left++;
                if (left > sum)
                    break;
            }

        }

        return ans;
    }
}
