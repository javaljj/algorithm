package leetcode.字符串;

public class 买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < i; j++) {
                if (prices[i] > prices[j]) {
                    max = Math.max(max, prices[i] - prices[j]);
                }
            }
        }
        return max;
    }
}
