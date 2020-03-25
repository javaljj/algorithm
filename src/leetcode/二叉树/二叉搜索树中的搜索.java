package leetcode.二叉树;

import publicnode.TreeNode;

public class 二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
            if (root == null)
                return null;

            if (root.val > val) { //往左走
               root = searchBST(root.left,val);
            }else if(root.val < val){
                root = searchBST(root.right,val);
            }
            return root;
    }

}
