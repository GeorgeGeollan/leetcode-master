package geollan.leetcode.lc3200_3299.lc3259;

/**
 * @Description 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/8/21 14:14
 * @Author: Geollan
 **/
public class Solution01 {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n = energyDrinkA.length;
        long[][] f = new long[2][n + 2];
        for(int i = 0; i < n; i++) {
            f[0][i + 2] = Math.max(f[0][i + 1], f[1][i]) + energyDrinkB[i];
            f[1][i + 2] = Math.max(f[1][i + 1], f[0][i]) + energyDrinkA[i];
        }

        return Math.max(f[0][n + 1], f[1][n + 1]);
    }
}
