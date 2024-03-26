package geollan.newcoder.jz04;

/**
 * @Description 迭代 时间复杂度O(M + N) 空间复杂度O(1)
 * @Date: 2024/2/18 09:09
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean Find(int target, int[][] array) {
        // write code here
        if (array == null || array.length == 0)
            return false;

        int right = array[0].length - 1;
        int top = 0;

        while (right >= 0 && top < array.length) {
            if (array[top][right] == target)
                return true;
            else if (array[top][right] > target)
                right--;
            else
                top++;
        }

        return false;
    }
}
