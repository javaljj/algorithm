package leetcode.链表;

public class 区间和的个数 {

    public int countRangeSum(int[] nums, int lower, int upper) {
        int ans = 0;
        //双指针法
        for (int i = 0; i < nums.length; i++) {
            long sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= lower && sum <= upper) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
