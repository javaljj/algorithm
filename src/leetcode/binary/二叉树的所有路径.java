package leetcode.binary;

import publicnode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的所有路径 {

    static List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        list.clear();
        dfs("",root);
        return list;

    }

    public String dfs(String sb, TreeNode root) {
        if (root == null)
            return "";
        String tmp = sb;
        if (!"".equals(sb)) {
            sb += "->";
        }
        sb += root.val;
        if (root.left == null && root.right == null) {
            list.add(sb);
            return tmp;
        }

        String dfs = dfs(sb, root.left);
        String dfs1 = dfs(dfs, root.right);
        return dfs1;

    }
}
