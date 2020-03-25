package leetcode.二叉树;

import publicnode.BulidTree;
import publicnode.TreeNode;

public class 另一个树的子树 {
    public static void main(String[] args) {
        TreeNode tr = BulidTree.bulidTree(new Integer[]{3, 4, 5, 1, 2, null, null, 0});
        TreeNode tr1 = BulidTree.bulidTree(new Integer[]{4, 1, 2});
        isSubtree(tr, tr1);
    }

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        return dfs(s, t);
    }

    public static boolean dfs(TreeNode s, TreeNode t) {
        boolean isequal = isequal(s, t);
        if (isequal)
            return true;
        if (s == null)
            return false;

        if (dfs(s.left, t)) {
            return true;
        }
        if (dfs(s.right, t)) {
            return true;
        }

        return false;

    }


    public static boolean isequal(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;

        if (s == null || t == null)
            return false;
        if (s.val != t.val) {
            return false;
        }
        return isequal(s.left, t.left) &&
                isequal(s.right, t.right);
    }


}
