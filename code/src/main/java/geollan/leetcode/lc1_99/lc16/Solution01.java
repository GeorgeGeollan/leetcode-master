package geollan.leetcode.lc1_99.lc16;

import java.util.Arrays;

/**
 * @Description 时间复杂度O(N*N) 空间复杂度O(1)
 * @Date: 2024/7/25 10:03
 * @Author: Geollan
 **/
public class Solution01 {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int n = nums.length, ans = 0;
            int minDiff = Integer.MAX_VALUE;

            for(int i = 0; i < n - 2; i++) {
                if(i > 0 && nums[i] == nums[i - 1]) continue;

                int s = nums[i] + nums[i + 1] + nums[i + 2];
                if(s > target) {
                    if(s - target < minDiff) {
                        ans = s;
                    }

                    break;
                }

                s = nums[i] + nums[nums.length - 1] + nums[nums.length - 2];
                if(s < target) {
                    if(target - s < minDiff) {
                        minDiff = target - s;
                        ans = s;
                    }
                    continue;
                }


                int j = i + 1, k = n - 1;
                while(j < k) {
                    s = nums[i] + nums[j] + nums[k];
                    if(target == s) return s;

                    if(s < target) {
                        if(target - s < minDiff) {
                            minDiff = target - s;
                            ans = s;
                        }
                        j++;
                    }

                    if(s > target) {
                        if(s - target < minDiff) {
                            minDiff = s - target;
                            ans = s;
                        }
                        k--;
                    }
                }
            }

            return ans;
        }
    }
}
