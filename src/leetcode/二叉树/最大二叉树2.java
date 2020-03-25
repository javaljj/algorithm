package leetcode.二叉树;

import publicnode.TreeNode;

public class 最大二叉树2 {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) return null;

        if (val > root.val) {
            TreeNode curr = new TreeNode(val);
            curr.left = root;
            return curr;
        } else {
            root.right = insertIntoMaxTree(root.right, val);
        }
        return root;
    }

}
