package leetcode.array;

public class 移除元素 {

    public int removeElement(int[] nums, int val) {
        int countEq = 0;

        for (int i = 0; i < nums.length; i++) {

            nums[i - countEq] = nums[i];

            if (val == nums[i - countEq]) {
                countEq++;
            }
        }
        return nums.length - countEq;

    }
}
