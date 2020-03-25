package leetcode.array;

public class 最长上升子序列 {

    public static void main(String[] args) {
        lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int maxCount = 1;
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] = dp[i] + 1;
            maxCount = Math.max(maxCount, dp[i]);
        }
        System.out.println(maxCount);
        return maxCount;
    }
}
