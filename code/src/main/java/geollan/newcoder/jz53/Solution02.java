package geollan.newcoder.jz53;

/**
 * @Description 迭代/二分法 时间复杂度O(logN) 空间复杂度O(1)
 * @Date: 2024/2/7 10:46
 * @Author: Geollan
 **/
public class Solution02 {
    public int GetNumberOfK(int[] nums, int k) {
        int n = nums.length;
        int l1 = 0, l2 = 0, r1 = n - 1, r2 = n - 1;
        while (l1 <= r1) {
            int mid = (l1 + r1) / 2;
            if (nums[mid] < k)
                l1 = mid + 1;
            else
                r1 = mid - 1;
        }

        while (l2 <= r2) {
            int mid = (l2 + r2) / 2;
            if (nums[mid] <= k)
                l2 = mid + 1;
            else
                r2 = mid - 1;
        }

        return r2 - l1 + 1;
    }
}
