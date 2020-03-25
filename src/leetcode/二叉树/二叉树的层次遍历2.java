package leetcode.二叉树;

import publicnode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的层次遍历2 {
    static List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ans.clear();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        bfs(list);
        return ans;
    }

    public static void bfs(List<TreeNode> preList) {
        if (preList.size() == 0) {
            return;
        }

        List<TreeNode> list = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < preList.size(); i++) {
            v.add(preList.get(i).val);
            if (preList.get(i).left != null)
                list.add(preList.get(i).left);
            if (preList.get(i).right != null)
                list.add(preList.get(i).right);
        }
        ans.add(0,v);
        bfs(list);

    }

}
