package jzoffer;

import publicnode.TreeNode;

public class BinaryTree {
    public static void main(String[] args) {

        System.out.println(

        );
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        if (root == null || root.val == p.val || root.val == p.val)
            return root;


        //只有搜索
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left ==null)
            return right;

        if(right ==null)
            return left;

        return root;

    }
}
