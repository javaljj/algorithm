package leetcode.回溯算法;

import java.util.HashMap;

public class 网格照明 {

    public static void main(String[] args) {

    }

    private final int[] dx = {0, 1, -1, 0, 0, 1, 1, -1, -1};
    private final int[] dy = {0, 0, 0, 1, -1, 1, -1, 1, -1};
    // 记录所有点亮的灯光
    // key = N * x + y
    private final HashMap<Integer, Boolean> light = new HashMap<>();
    // 行
    private final HashMap<Integer, Integer> row = new HashMap<>();
    // 列
    private final HashMap<Integer, Integer> col = new HashMap<>();
    // 正斜线
    private final HashMap<Integer, Integer> forwardSlash = new HashMap<>();
    // 反斜线
    private final HashMap<Integer, Integer> backslash = new HashMap<>();

    private int N = -1;

    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {

        this.N = N;

        // 亮灯
        for (int[] lamp : lamps) {
            openOrDown(true, lamp[0], lamp[1]);
        }

        // 查询
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = isLight(queries[i][0], queries[i][1]) ? 1 : 0;
            // 灭灯
            for (int j = 0; j < 9; j++) {
                openOrDown(false, dx[j] + queries[i][0], dy[j] + queries[i][1]);
            }
        }

        return res;
    }

    private boolean isLight(int x, int y) {
        return row.getOrDefault(x, 0) > 0
                || col.getOrDefault(y, 0) > 0
                || forwardSlash.getOrDefault(x - y, 0) > 0
                || backslash.getOrDefault(x + y, 0) > 0;
    }


    private void openOrDown(boolean openOrDown, int x, int y) {
        // 校验开关正确
        final Boolean orDefault = light.getOrDefault(N * x + y, false);
        if (x >= N || x < 0 || y >= N || y < 0 || orDefault.equals(openOrDown)) {
            return;
        }

        int opera = openOrDown ? 1 : -1;
        row.put(x, row.getOrDefault(x, 0) + opera);
        col.put(y, col.getOrDefault(y, 0) + opera);
        final int i = x - y;
        forwardSlash.put(i, forwardSlash.getOrDefault(i, 0) + opera);
        final int j = x + y;
        backslash.put(j, backslash.getOrDefault(j, 0) + opera);
        light.put(N * x + y, openOrDown);
    }

    public static void print(boolean[][] qp) {
        System.out.println("##################");
        for (int i = 0; i < qp.length; i++) {
            for (int j = 0; j < qp.length; j++) {
                System.out.print(qp[i][j] ? String.format("%3d", 1) : String.format("%3d", 0));
            }
            System.out.println();
        }
    }

}
