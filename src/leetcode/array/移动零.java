package leetcode.array;

public class 移动零 {

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        int zero = 0, index = 0;

        while (index < nums.length) {
            while (zero < nums.length && nums[zero] != 0) {
                zero++;
            }
            index = zero + 1;

            while (index < nums.length && nums[index] == 0) {
                index++;
            }
            if(index >= nums.length)
                return;
            //交换数据
            nums[zero] = nums[index];
            nums[index] = 0;
        }
        System.out.println();
    }
}
