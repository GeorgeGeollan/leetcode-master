package src.geollan.leetcode.lc3300_3399.lc3340;

/**
 * @Description
 * @Date: 2025/3/14 8:38
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean isBalanced(String num) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < num.length(); i++) {
            int val = num.charAt(i) -'0';

            if(i % 2 == 0)
                evenSum += val;

            else
                oddSum += val;
        }

        System.out.println(evenSum + " " + oddSum);
        return evenSum == oddSum;
    }
}
