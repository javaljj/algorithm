package leetcode.二叉树;

import publicnode.TreeNode;

public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if(root ==null)
            return null;

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }


}
