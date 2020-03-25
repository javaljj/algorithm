package leetcode.二叉树;

import java.util.ArrayList;
import java.util.List;

public class N叉树的后序遍历 {

    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();

        circure(root, ans);
        return ans;

    }

    public void circure(Node node, List<Integer> ans) {
        if (node == null)
            return;



        for (Node child : node.children) {
            circure(child, ans);
        }
        ans.add(node.val);
    }

}



