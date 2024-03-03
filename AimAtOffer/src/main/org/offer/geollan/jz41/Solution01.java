package main.org.offer.geollan.jz41;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description 迭代/暴力破解法
 * @Date: 2024/3/3 12:36
 * @Author: Geollan
 **/
public class Solution01 {
    ArrayList<Integer> list = new ArrayList<>();

    // 时间复杂度O(1) 空间复杂度O(N)
    public void Insert(Integer num) {
        list.add(num);
    }

    // 时间复杂度 O(N) 空间复杂度O(N)
    public Double GetMedian() {
        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            return Double.valueOf(arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }

        return Double.valueOf(arr[arr.length / 2]);
    }
}
