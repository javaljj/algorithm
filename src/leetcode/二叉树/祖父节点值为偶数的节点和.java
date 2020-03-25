package leetcode.二叉树;

import publicnode.TreeNode;

public class 祖父节点值为偶数的节点和 {
    //遍历节点，如果是偶数，就找到孙子累加
    public int sumEvenGrandparent(TreeNode root) {

        if (root == null)
            return 0;
        int val = 0;

        if(root.val%2 == 0)
            val += sumSunzi(root);

        val += sumEvenGrandparent(root.left);
        val += sumEvenGrandparent(root.right);

        return val;


    }


    public int sumSunzi(TreeNode curr) {
        int sum = 0;
        if (curr != null && curr.left != null && curr.left.left != null) {
            sum += curr.left.left.val;
        }
        if (curr != null && curr.left != null && curr.left.right != null) {
            sum += curr.left.right.val;
        }
        if (curr != null && curr.right != null && curr.right.left != null) {
            sum += curr.right.left.val;
        }
        if (curr != null && curr.right != null && curr.right.right != null) {
            sum += curr.right.right.val;
        }
        return sum;
    }
}
