package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < nums.length + 1; i++) {
            if (Arrays.binarySearch(nums, i) == -1) {
                result.add(i);
            }
        }

        return result;
    }
}
