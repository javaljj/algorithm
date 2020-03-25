package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> result  = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result = getResult(ans, result);
        }
        return ans;
    }

    public static List<Integer> getResult(List<List<Integer>> ans, List<Integer> before) {
        List<Integer> list = new ArrayList<>();
        if (before.size() == 0) {
            list.add(1);
            ans.add(list);
            return list;
        }
        if (before.size() == 1) {
            list.add(1);
            list.add(1);
            ans.add(list);
            return list;
        }

        list.add(1);
        if (before.size() >= 2)
            for (int i = 0; i < before.size() - 1; i++) {
                list.add(before.get(i) + before.get(i + 1));
            }
        list.add(1);
        ans.add(list);
        return list;
    }
}
