package jzoffer;

import java.util.ArrayList;
import java.util.List;

public class 和为s的连续正数序列 {
    public int[][] findContinuousSequence(int target) {
        //滑动窗口
        List<int[]> ans = new ArrayList<>();
        int start = 1, end = target / 2;
        while (start < end) {
            int tmp = countWindow(start, end);
            if (tmp > target) {
                end--;
            } else if (tmp < target) {
                end++;
            } else {
                int[] result = new int[end - start + 1];
                for (int i = 0; i < result.length; i++) {
                    result[i] = start + i;
                }
                ans.add(result);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }



    public static int countWindow(int start, int end) {
        return (start + end) * (end - start + 1) / 2;
    }
}
