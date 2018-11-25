package leetcode;

import java.util.HashMap;

public class PreSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 2, 6, 5, 3, 7};

        // 后缀和的Map，降低查找的时间复杂度
        int sum = 0;
        HashMap<Integer, Integer> suffixSumMap = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            suffixSumMap.put(sum, i);
        }

        // 前缀和
        int prefixSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum += arr[i];
            if (suffixSumMap.keySet().contains(prefixSum)) {
                int m = i + 1;
                int n = suffixSumMap.get(prefixSum) - 1;
                if (prefixSum * 3 == sum - arr[m] - arr[n]) {
                    System.out.println("subSum: " + prefixSum);
                    System.out.println("bound1: " + m);
                    System.out.println("bound2: " + n);
                    break;
                }
            }
        }
        System.out.println("finish~~");
    }
}
