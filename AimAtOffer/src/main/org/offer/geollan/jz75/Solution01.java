package main.org.offer.geollan.jz75;

/**
 * @Description
 * @Date: 2024/3/23 18:17
 * @Author: Geollan
 **/
public class Solution01 {
    char[] cnt = new char[256];
    String s = "";
    public void Insert(char ch) {
        s += ch;
        cnt[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int size = s.length();

        for(int i = 0; i < size; i++) {
            if(cnt[s.charAt(i)] == 1) return s.charAt(i);
        }

        return '#';
    }
}
