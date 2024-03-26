package geollan.newcoder.jz57;

import java.util.ArrayList;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/19 08:38
 * @Author: Geollan
 **/
public class Solution01 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int l = 0, r = array.length - 1;
        ArrayList<Integer> res = new ArrayList<>();

        while (l < r) {
            int target = array[l] + array[r];
            if (target > sum)
                r--;

            else if (target < sum)
                l++;

            else {
                res.add(array[l]);
                res.add(array[r]);
                return res;
            }
        }

        return res;
    }
}
