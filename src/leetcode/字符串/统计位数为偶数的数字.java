package leetcode.字符串;

public class 统计位数为偶数的数字 {

    public static int findNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isOdd(nums[i]))
                sum++;

        }
        return sum;

    }

    public static boolean isOdd(Integer num) {
        if (num.toString().length() % 2 == 0) {
            return true;
        }
        return false;
    }
}
