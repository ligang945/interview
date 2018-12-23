package leetcode;

import static leetcode.Comm.*;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        if (k < length / 2 + 1) {
            for (int i = 0; i < k; i++) {
                swap(nums, i, findIndexOfMax(nums, i, length));
            }
            return nums[k - 1];
        } else {
            for (int i = 0; i < length - k + 1; i++) {
                swap(nums, i, findIndexOfMin(nums, i, length));
            }
            return nums[length - k];
        }
    }
}
