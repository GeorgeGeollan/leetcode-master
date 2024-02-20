package main.org.offer.geollan.jz38;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Description 递归 时间复杂度O(N!N) 空间复杂度O(N*N)
 * @Date: 2024/2/20 09:15
 * @Author: Geollan
 **/
public class Solution01 {
    char[] arr;
    ArrayList<String> res = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        // write code here
        arr = str.toCharArray();
        dfs(0);
        return res;
    }

    void dfs(int x) {
        if (x == arr.length - 1) {
            res.add(new String(arr));
            return;
        }

        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < arr.length; i++) {
            if (set.contains(arr[i]))
                continue;
            set.add(arr[i]);
            swap(i, x);
            dfs(x + 1);
            swap(i, x);
        }
    }

    void swap(int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
