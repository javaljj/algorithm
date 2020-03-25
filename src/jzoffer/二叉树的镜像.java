package jzoffer;

import publicnode.TreeNode;

public class 二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root ==null)
            return null;
        TreeNode l = mirrorTree(root.left);
        TreeNode r = mirrorTree(root.right);
        root.right= l;
        root.left= r;

        return root;
    }

}
