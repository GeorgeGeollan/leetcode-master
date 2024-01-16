package main.org.offer.geollan.jz03;

/**
 * @Description 空间换时间，因为题目中数组的长度在0-10000之间，可以考虑设创建一个长度为10000的数组 时间复杂度O(n) 空间复杂度O(n)
 * @Date: 2024/1/5 12:20
 * @Author: Geollan
 **/
public class Solution03 {
    public int duplicate(int[] numbers) {
        int[] cnt = new int[10000];

        for (int num : numbers) {
            cnt[num]++;

            if (cnt[num] > 1) {
                return num;
            }
        }

        return -1;
    }
}
