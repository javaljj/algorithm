package leetcode.字符串;

import java.util.Arrays;
import java.util.Comparator;

public class 买卖股票的最佳时机3 {

    public static void main(String[] args) {
        maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
    }

    public static int maxProfit(int[] prices) {
        Integer[] dp = new Integer[prices.length];
        Arrays.fill(dp, 0);
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < i; j++) {
                if (prices[i] > prices[j]) {

                }
            }

        }
        Arrays.sort(dp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        max = dp[0] + dp[1];

        return max;
    }

}
