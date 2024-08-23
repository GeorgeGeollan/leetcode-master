package geollan.leetcode.lc2900_2999.lc2956;

import java.util.HashSet;

/**
 * @Description 哈希集合 时间复杂度O(M+N) 空间复杂度O(M+N)
 * @Date: 2024/7/16 9:15
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int m = 0, n = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int a: nums1) {
            set1.add(a);
        }

        for(int a: nums2) {
            set2.add(a);
        }

        for(int a: nums1) {
            if(set2.contains(a)) n++;
        }

        for(int a: nums2) {
            if(set1.contains(a)) m++;
        }

        return new int[]{n, m};
    }
}
