package leetcode.array;

public class 删除排序数组中的重复项2 {

    public int removeDuplicates(int[] nums) {
        int count = 1;
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[index++] = nums[i];
            }

        }

        return index;

    }
}
