package src.geollan.leetcode.lc900_999.lc922;

/**
 * @Description
 * @Date: 2025/2/4 14:25
 * @Author: Geollan
 **/
public class Solution01 {
    public int[] sortArrayByParityII(int[] nums) {
        int oddIdx = 1;
        int evenIdx = 0;
        int[] newArr = new int[nums.length];
        for(int num: nums) {
            if(num % 2 == 0) {
                newArr[evenIdx] = num;
                evenIdx += 2;
            }

            else {
                newArr[oddIdx] = num;
                oddIdx += 2;
            }
        }

        return newArr;
    }
}
