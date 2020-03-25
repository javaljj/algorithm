package leetcode.动态规划;

public class 打家劫舍 {

    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }

        if (nums.length < 3) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        int ans = Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = nums[1];
        int max = 0;
        for (int i = 2; i < nums.length; i++) {

            max = Math.max(max, dp[i - 2]);

            dp[i] = nums[i] + max;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

}
