package leetcode.图;

import java.util.ArrayList;
import java.util.List;

public class 所有可能的路径 {

    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(allPathsSourceTarget(new int[][]{{1,2}, {3}, {3}, {}}));
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans.clear();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(graph, 0, list);
        return ans;

    }

    public static void dfs(int[][] graph, int row, List<Integer> list) {
        System.out.println(row);

        if ( row == graph.length -1) {
            ans.add(new ArrayList<>(list));
            return;
        }

        int[] tmp = graph[row];
        for (int i = 0; i < tmp.length; i++) {
            list.add(tmp[i]);
            dfs(graph, tmp[i], list);
            list.remove(list.size() - 1);
        }
    }
}
