package leetcode.array;

public class 最长连续递增序列 {

    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        int maxLength = 0;
        if (nums.length >= 0) {
            dp[0] = 1;
            maxLength = Math.max(maxLength, dp[0]);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                maxLength = Math.max(maxLength, dp[i]);
                continue;
            }
            if (nums[i] <= nums[i - 1]) {
                dp[i] = 1;
            }
        }
        return maxLength;
    }
}
