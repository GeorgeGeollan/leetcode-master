package main.org.offer.geollan.jz33;

/**
 * @Description 递归 时间复杂度O(N*N) 空间复杂度O(N)
 * @Date: 2024/2/2 14:27
 * @Author: Geollan
 **/
public class Solution01 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0)
            return false;
        return recur(sequence, 0, sequence.length - 1);
    }

    public boolean recur(int[] sequence, int i, int j) {
        if (i >= j)
            return true;

        int p = i;
        while (sequence[p] < sequence[j])
            p++;
        int m = p;
        while (sequence[p] > sequence[j])
            p++;

        return p == j && recur(sequence, i, m - 1) && recur(sequence, m, j - 1);
    }
}
