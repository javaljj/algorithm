package leetcode.二叉树;

import publicnode.TreeNode;

public class 平衡二叉树 {

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(height(root.left) - height(root.right)) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }

    public int height(TreeNode ndoe) {
        if (ndoe == null)
            return 0;

        return Math.max(height(ndoe.left), height(ndoe.right)) + 1;
    }

}
