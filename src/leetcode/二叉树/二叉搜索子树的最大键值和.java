package leetcode.二叉树;

import publicnode.BulidTree;
import publicnode.TreeNode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 二叉搜索子树的最大键值和 {
    public static void main(String[] args) {
        TreeNode treeNode = BulidTree.bulidTree(new Integer[]{4,8,null,6,1,9,null,-5,4,null,null,null,-3,null,10});
        maxSumBST(treeNode);
    }

    static Set<Integer> set = new TreeSet<>((n1, n2) -> n2 - n1);

    public static int maxSumBST(TreeNode root) {
        if (root == null)
            return 0;
        set.clear();

        dfs(root);
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        int a = -1;
        if (iterator.hasNext()) {
            a = iterator.next();
        }
        return a <= 0 ? 0 : a;
    }


    public static int[] dfs(TreeNode root) {
        int[] ans = new int[2];
        if (root == null) {
            ans[0] = 1;
            return ans;
        }

        if (root.left == null && root.right == null) {//叶子节点

            ans[0] = 1;
            ans[1] = root.val;
            set.add( ans[1]);
            return ans;
        }

        //子树是合法的平衡树
        int[] dfs1 = dfs(root.left);
        int[] dfs2 = dfs(root.right);
        boolean dfs = dfs2[0] == 1 && dfs1[0] == 1;
        if (dfs && root.right == null && root.left != null && root.left.val < root.val) {
//            root.val = root.val + root.left.val;

            ans[0] = 1;
            ans[1] = root.val + dfs1[1];
            set.add(ans[1]);
            return ans;
        } else if (dfs && root.left == null && root.right != null && root.right.val > root.val) {
            //root.val = root.val + root.right.val;

            ans[0] = 1;
            ans[1] = root.val + dfs2[1];
            set.add(ans[1]);
            return ans;
        } else if (dfs && root.right != null && root.left != null && root.right.val > root.val && root.left.val < root.val) {
            //root.val = root.val + root.right.val + root.left.val;
            ans[0] = 1;
            ans[1] = root.val + dfs1[1] + dfs2[1];;
            set.add(ans[1]);
            return ans;
        }
        return ans;
    }
}
