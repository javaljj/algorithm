package jzoffer;

import publicnode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉搜索树的第k大节点 {
    static List<Integer> ans = new ArrayList();

    public int kthLargest(TreeNode root, int k) {
        ans.clear();
        dfs(root);
        System.out.println(ans);

        return ans.get(k - 1);
    }

    public void dfs(TreeNode node) {
        if (node == null)
            return;

        dfs(node.left);
        ans.add(node.val);
        dfs(node.right);
    }
}
