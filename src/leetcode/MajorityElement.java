package leetcode;

import java.util.ArrayList;

public class MajorityElement {
    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        for (int num : nums) {
            if (num > nums[0]) {
                l.add(num);
            }
            if (num < nums[0]) {
                s.add(num);
            }
        }
        if (l.size() > nums.length / 2) {
            int max = Integer.MIN_VALUE;
            for (Integer x : l) {
                if (x > max) {
                    max = x;
                }
            }
            return max;
        }
        if (s.size() > nums.length / 2) {
            int min = Integer.MAX_VALUE;
            for (Integer x : l) {
                if (x < min) {
                    min = x;
                }
            }
            return min;
        }
        return nums[0];
    }
}
