package geollan.leetcode.lc1071;

/**
 * @Description 枚举/笨办法
 * @Date: 2024/3/25 08:32
 * @Author: Geollan
 **/
public class Solution01 {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for(int i = 0; i < n; i++) {
            sb.append(str2.charAt(i));
            if(isPart(str1, str2, sb)) ans = sb.toString();
        }

        return ans;
    }

    public boolean isPart(String str1, String str2, StringBuilder part) {
        int m = str1.length(), n = str2.length(), len = part.length();
        int mTimes = m / len;
        int nTimes = n / len;
        StringBuilder msb = new StringBuilder();
        StringBuilder nsb = new StringBuilder();

        for(int i = 0 ; i < mTimes; i++) msb.append(part);
        for(int i = 0 ; i < nTimes; i++) nsb.append(part);

        return str1.equals(msb.toString()) && str2.equals(nsb.toString());
    }
}
