package geollan.leetcode.lc700_799.lc706;

import java.util.Arrays;

/**
 * @Description 简单数组 时间复杂度O(1) 空间复杂度O(1)
 * @Date: 2024/4/15 9:01
 * @Author: Geollan
 **/
public class Solution01 {
    class MyHashMap {
        int[] map;

        public MyHashMap() {
            map = new int[1000001];
            Arrays.fill(map, -1);
        }

        public void put(int key, int value) {
            map[key] = value;
        }

        public int get(int key) {
            return map[key];
        }

        public void remove(int key) {
            map[key] = -1;
        }
    }
}
