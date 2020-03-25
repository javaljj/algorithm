package leetcode.array;

import java.util.Arrays;

public class 合并两个有序数组 {

    public static void main(String[] args) {

        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }

}
