package leetcode.字符串;

public class 买卖股票的最佳时机2 {

    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        //滑动窗口计算
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        System.out.println(max);
        return max;
    }

}
