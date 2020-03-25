package jzoffer;

import publicnode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 从上到下打印二叉树2 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> que = new LinkedList();
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null)
            return ans;

        que.add(root);
        while (!que.isEmpty()) {
            List<Integer> result = new ArrayList<>();
            for (int i = que.size(); i > 0; i--) {
                TreeNode tmp = que.poll();
                if (tmp == null)
                    continue;
                que.offer(tmp.left);
                que.offer(tmp.right);
                result.add(tmp.val);
            }
            if (result.size() > 0)
                ans.add(result);
        }
        return ans;
    }


}
