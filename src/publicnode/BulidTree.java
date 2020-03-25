package publicnode;

import java.util.*;

public class BulidTree {
    public static void main(String[] args) {
      // TreeNode treeNode = BulidTree.bulidTree1(new Integer[]{1, 4, 3, 2, 4, 2, 5, null, null, null, null, null, null, 4, 6},0);
       TreeNode treeNode = bulidTree(new Integer[]{1, 4, 3, 2, 4, 2, 5, null, null, null, null, null, null, 4, 6});
//        Queue<Integer> q=new LinkedList();
//        q.offer(1);
//        q.offer(null);
//        q.offer(2);
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());


    }

    public static TreeNode bulidTree1(Integer[] nums, int index) {
        if (nums.length == 0)
            return null;

        TreeNode root = new TreeNode(nums[index]);

        if (index + 1 < nums.length) {
            TreeNode left = bulidTree1(nums, index + 1);
            root.left = left;
        }

        if (index + 2 < nums.length) {
            TreeNode right = bulidTree1(nums, index + 2);
            root.right = right;
        }

        return root;
    }

    public static TreeNode bulidTree(Integer[] nums) {
        if (nums.length == 0) return null;

        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);
            while(queue.element() == null){
                queue.poll();
            }
            if (i%2 ==1&&queue.element().left == null) {
                queue.element().left = nums[i] == null ? null : new TreeNode(nums[i]);
                System.out.println("left "+ queue.element().left);
                queue.offer(queue.element().left);
            } else if (i%2 ==0 &&queue.element().right == null) {
                queue.element().right = nums[i] == null ? null : new TreeNode(nums[i]);
                System.out.println("right "+ queue.element().right);
                queue.offer(queue.element().right);
                queue.poll();

            }
            System.out.println(queue);
        }
        return root;
    }

    static List<List<Integer>> list = new ArrayList<>();

    public static void printTree(Queue<TreeNode> queue) {

        Queue<TreeNode> tmp = new LinkedList();
        List<Integer> tmplist = new ArrayList<>();
        while (queue.size() > 0) {
            TreeNode poll = queue.poll();
            tmplist.add(poll.val);
            tmp.offer(poll.left);
            tmp.offer(poll.right);

        }

        list.add(tmplist);
        printTree(tmp);


    }

}
