package leetcode.binary;

import publicnode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 路径总和2 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        lists.clear();
        List<Integer> list = new ArrayList<>();
        backTrack(list,root,sum);
        return lists;
    }

    static int count = 0;
    static List<List<Integer>> lists = new ArrayList<>();

    public void backTrack(List<Integer> list, TreeNode root, int sum) {

        if (root == null)
            return;

        count = count + root.val;
        list.add(root.val);
        if (root.left == null && root.right == null) {//根节点才返回

            if (count == sum) {
                lists.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
                count -= root.val;
                return;
            } else {
                list.remove(list.size() - 1);
                count -= root.val;
                return;
            }
        }

        backTrack(list,root.left, sum);
        backTrack(list,root.right, sum);
        count -= root.val;
        list.remove(list.size() - 1);
    }
}
