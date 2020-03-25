package leetcode.array;

import java.util.*;

public class 最接近的三数之和 {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1, 2, 0}, 3));
    }


    public static int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int tmp = nums[i] + nums[l] + nums[r];
                if (tmp < target) {
                    if (min > (target - tmp)) {
                        min = target - tmp;
                        ans = tmp;
                    }
                    l++;
                } else {
                    if (min > tmp - target) {
                        min = tmp - target;
                        ans = tmp;
                    }
                    r--;
                }
            }

        }
        return ans;
    }
}
