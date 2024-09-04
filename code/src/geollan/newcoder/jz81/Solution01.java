package geollan.newcoder.jz81;

/**
 * @Description 迭代 时间复杂度O(N) 空间复杂度O(1)
 * @Date: 2024/3/21 08:58
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] reOrderArrayTwo (int[] array) {
        // write code here
        int n = array.length;
        int left = 0, right = n - 1;
        while(left < right) {
            while(left < right && array[left] % 2 == 1) left++;
            while(left < right && array[right] % 2 == 0) right--;

            if(left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        return array;
    }
}
