package leetcode.二叉树;

public class 不同的二叉搜索树 {

    public static void main(String[] args) {
        System.out.println(numTrees(10));
    }

    public static int numTrees(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 1;
        ans[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                ans[i] += ans[j - 1] * ans[i - j];
            }
        }

        return ans[n];
    }
}
