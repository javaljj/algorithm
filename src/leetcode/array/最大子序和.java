package leetcode.array;

//53. 最大子序和
public class 最大子序和 {
    public static void main(String[] args) {


    }

    //贪心算法
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        for (int i = 0; i < nums.length; i++) {
            //保留当前值，和当前值+上次值的和
            current = Math.max(nums[i], max + nums[i]);
            //保留结果最大值
            max = Math.max(max, current);

        }
        return max;

    }


    //动态规划
    public static int maxSubArray1(int[] nums) {
        int max = nums[0];


        for (int i = 1; i < nums.length; i++) {
            //保留当前值，和当前值+上次值的和
            if (nums[i - 1] > 0)
                nums[i] += nums[i - 1];
            //保留结果最大值
            max = Math.max(max, nums[i]);

        }
        return max;

    }


}
