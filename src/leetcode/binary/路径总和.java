package leetcode.binary;

import publicnode.TreeNode;

public class 路径总和 {

    public boolean hasPathSum(TreeNode root, int sum) {
        count = 0;
        return backTrack(root, sum);
    }

    static int count = 0;

    public boolean backTrack(TreeNode root, int sum) {

        if (root == null)
            return false;

        count = count + root.val;
        if (root.left == null && root.right == null) {//根节点才返回
            if (count == sum) {
                count -= root.val;
                return true;
            } else {
                count -= root.val;
                return false;
            }
        }

        boolean b = backTrack(root.left, sum);
        boolean b1 = backTrack(root.right, sum);
        count -= root.val;
        return b || b1;

    }

}
