package leetcode.array;

public class 寻找两个有序数组的中位数 {

    public static void main(String[] args) {
        int[] x = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(x));
    }

    //双指针法，移动短的指针
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (right > left) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }

        }

        return maxArea;


    }


}
