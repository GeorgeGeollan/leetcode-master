package main.org.offer.geollan.jz03;

import java.util.HashSet;

/**
 * @Description 使用Set来断定是否有元素重复 时间复杂度O(n) 空间复杂度O(n)
 * @Date: 2024/1/5 11:32
 * @Author: Geollan
 **/
public class Solution01 {
    /**
     * 
     * @param numbers
     * @return int
     */
    public int duplicate(int[] numbers) {
        // 定义一个HashSet
        HashSet<Integer> set = new HashSet<>();
        // 遍历数组
        for (int num : numbers) {
            // 添加数据，若存在，则返回true，否则返回false
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
