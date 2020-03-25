package leetcode.二叉树;

import publicnode.TreeNode;

public class 二叉树展开为链表 {

    public void flatten(TreeNode root) {
        TreeNode newTree = new TreeNode(-1);
        TreeNode first = newTree;

        dfs(newTree, root);
        root = first;

    }

    public void dfs(TreeNode node, TreeNode treeNode) {
        if (treeNode == null)
            return ;
        dfs(node, treeNode.left);
        node.left = new TreeNode(treeNode.val);
        node = node.left;
        dfs(node, treeNode.right);
    }
}
