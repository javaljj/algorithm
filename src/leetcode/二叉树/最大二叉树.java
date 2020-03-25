package leetcode.二叉树;

import publicnode.TreeNode;

public class 最大二叉树 {
    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0)
            return null;


        return bulidTree(null, nums, 0, nums.length);
    }

    public static TreeNode bulidTree(TreeNode curr, int[] nums, int start, int end) {

        if (start >= end)
            return null;

        int max = nums[start];
        int mid = start;
        for (int i = start + 1; i < end; i++) {
            if (nums[i] > max) {
                mid = i;
                max = nums[i];
            }
        }

        if (curr == null) {
            curr = new TreeNode(max);
        }

        curr.left = bulidTree(curr.left, nums, start, mid);
        curr.right = bulidTree(curr.right, nums, mid + 1, end);

        return curr;
    }
}
