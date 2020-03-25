package leetcode.二叉树;

import publicnode.TreeNode;

public class 二叉树剪枝 {
    public TreeNode pruneTree(TreeNode root) {

        if (root == null)
            return null;

        int backtrack = backtrack(root);
        if(backtrack == 0 && root.val ==0){
            return null;
        }

        return root;

    }


    public int backtrack(TreeNode root) {
        if (root == null)
            return 0;
        int tmp = root.val;
        int backtrack = backtrack(root.left);
        if (backtrack == 0)
            root.left = null;

        tmp = Math.max(tmp, backtrack);
        int backtrack1 = backtrack(root.right);

        if (backtrack1 == 0)
            root.right = null;

        tmp = Math.max(tmp, backtrack1);

        return tmp;

    }
}
