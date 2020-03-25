package leetcode.二叉树;

import publicnode.TreeNode;

public class 对称二叉树 {

    public boolean isSymmetric(TreeNode root) {


        return dg(root.left, root.right);


    }

    public boolean dg(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;


        return left.val == right.val &&
                dg(left.left,right.right)&&
                dg(left.right,right.left);


    }
}
