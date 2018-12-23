package leetcode;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int[] ints = new int[nums.length - 1];
        for (int num : nums) {
            if (ints[num - 1] == 0)
                ints[num - 1] += 1;
            else
                return num;
        }

        return -1;
    }
}
