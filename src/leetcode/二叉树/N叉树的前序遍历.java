package leetcode.二叉树;

import java.util.ArrayList;
import java.util.List;

public class N叉树的前序遍历 {

    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();

        circure(root, ans);
        return ans;

    }

    public void circure(Node node, List<Integer> ans) {
        if (node == null)
            return;

        ans.add(node.val);

        for (Node child : node.children) {
            circure(child, ans);
        }
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

