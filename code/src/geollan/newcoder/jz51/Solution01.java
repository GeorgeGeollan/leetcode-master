package geollan.newcoder.jz51;

/**
 * @Description 递归/归并排序 时间复杂度O(NlogN) 空间复杂度O(N)
 * @Date: 2024/3/2 13:49
 * @Author: Geollan
 **/
public class Solution01 {
    int cnt;

    public int InversePairs(int[] nums) {
        // write code here
        this.cnt = 0;
        merge(nums, 0, nums.length - 1);
        return cnt;
    }

    public void merge(int[] nums, int left, int right) {
        int mid = left + ((right - left) >> 1);

        if (left < right) {
            merge(nums, left, mid);
            merge(nums, mid + 1, right);
            mergeSort(nums, left, mid, right);
        }
    }

    public void mergeSort(int[] nums, int left, int mid, int right) {
        int[] arr = new int[right - left + 1];
        int temp1 = left, temp2 = mid + 1;
        int index = 0;
        while (temp1 <= mid && temp2 <= right) {
            if (nums[temp1] <= nums[temp2]) {
                arr[index++] = nums[temp1++];
            }

            else {
                cnt += (mid - temp1 + 1);
                cnt %= 1000000007;
                arr[index++] = nums[temp2++];
            }
        }

        while (temp1 <= mid) {
            arr[index++] = nums[temp1++];
        }

        while (temp2 <= right) {
            arr[index++] = nums[temp2++];
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i + left] = arr[i];
        }
    }
}
