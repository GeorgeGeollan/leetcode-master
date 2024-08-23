package geollan.leetcode.lc1_99.lc11;

/**
 * @Description 贪心算法 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/4/4 11:56
 * @Author: Geollan
 **/
public class Solution01 {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxRect = 0;

        while(left < right) {
            int h = Math.min(height[left], height[right]);
            maxRect = Math.max(maxRect, h * (right - left));

            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxRect;
    }

    public int maxAreaEdited(int[] height) {
        int i = 0, j = height.length - 1, res = 0;

        while(i < j) {
            res = height[i] < height[j] ?
                Math.max(res, (j - i) * height[i++]):
                Math.max(res, (j - i) * height[j--]);
        }

        return res;
    }
}
