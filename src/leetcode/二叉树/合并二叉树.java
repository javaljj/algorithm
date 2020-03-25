package leetcode.二叉树;

import publicnode.TreeNode;

public class 合并二叉树 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        dfs(t1, t2);
        return t1;
    }

    public TreeNode dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;



        t1.left = dfs(t1.left, t2.left);
        t1.right = dfs(t1.right, t2.right);

        return t1;
    }
}
