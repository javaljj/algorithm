package leetcode.动态规划;

import java.util.Arrays;

public class 俄罗斯套娃信封问题 {

    public static void main(String[] args) {
        maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}});
    }


    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a1, a2) -> a1[0] == a2[0] ? a2[1] - a1[1] : a1[0] - a2[0]);

        int[] nums = new int[envelopes.length];

        for (int i = 0; i < envelopes.length; i++) {
            nums[i] = envelopes[i][1];
        }

        return lengthOfLIS(nums);
    }


    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);

            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (len == i)
                len++;
        }
        return len;
    }

}
