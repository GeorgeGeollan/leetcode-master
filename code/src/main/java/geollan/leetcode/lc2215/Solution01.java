package geollan.leetcode.lc2215;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 计数法 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/4/12 9:08
 * @Author: Geollan
 **/
public class Solution01 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int cnt1[] = new int[2001];
        int cnt2[] = new int[2001];

        for(int num: nums1) {
            cnt1[num + 1000]++;
        }

        for(int num: nums2) {
            cnt2[num + 1000]++;
        }

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for(int i = 0; i < 2001; i++) {
            if(cnt1[i] >= 1 && cnt2[i] == 0) {
                list1.add(i - 1000);
            }

            if(cnt2[i] >= 1 && cnt1[i] == 0) {
                list2.add(i - 1000);
            }
        }

        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}
