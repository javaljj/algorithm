package leetcode.二叉树;

import publicnode.TreeNode;

public class 左叶子之和 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.right == null && root.left == null) {
            return root.val;
        }

        int l = rever(root.left, true);
        int r = rever(root.right, false);
        return l + r;
    }

    public int rever(TreeNode root, boolean left) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            if (left) {
                return root.val;
            } else
                return 0;
        }

        return rever(root.left, true)+ rever(root.right, false);
    }
}
