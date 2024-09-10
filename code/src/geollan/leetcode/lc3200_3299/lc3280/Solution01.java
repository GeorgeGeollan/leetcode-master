package geollan.leetcode.lc3200_3299.lc3280;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/9/10 17:03
 * @Author: Geollan
 **/
public class Solution01 {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        String[] data = date.split("-");

        for(String datum: data) {
            sb.append(dateToBinary(datum));
            sb.append("-");
        }

        return sb.substring(0, sb.length() - 1).toString();
    }

    public String dateToBinary(String data) {
        StringBuilder sb = new StringBuilder();
        int target = Integer.valueOf(data);

        while(target != 0) {
            sb.append(target % 2);
            target /= 2;
        }

        return sb.reverse().toString();
    }
}
