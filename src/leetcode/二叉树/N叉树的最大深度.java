package leetcode.二叉树;

public class N叉树的最大深度 {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;

        int curr = 0;
        for (Node child : root.children) {
            curr = Math.max(curr, maxDepth(child));
        }

        return curr + 1;
    }


}

