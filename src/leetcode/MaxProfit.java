package leetcode;

import static leetcode.Comm.findMax;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int profit = findMax(prices, i + 1, prices.length) - prices[i];
            if (profit > max) max = profit;
        }
        if (max < 0) max = 0;
        return max;
    }
}
