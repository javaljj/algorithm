package leetcode.回溯算法;

import java.util.ArrayList;
import java.util.List;

public class N皇后 {


    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
   static   List<List<String>> ans =new ArrayList<>()
;
    public static List<List<String>> solveNQueens(int n) {
        ans.clear();
        boolean[][] qp = new boolean[n][n];

        for (int i = 0; i < qp.length; i++) {
            backtrack(qp, 0, i);
            qp[0][i] = false;
        }

        return ans;
    }

    public static void backtrack(boolean[][] qp, int row, int col) {
        //当前落子的位置
        qp[row][col] = true;
        //print(qp);
        if (!isvalid(qp, row, col)) {
            return;
        }
        //到这个位置说明是合法落子，如果刚好又是最后一个位置，说明有效啊
        if (row == qp.length - 1) {
            ans.add(getresult(qp));
            return;
        }
        //遍历一行的每个位置
        for (int i = 0; i < qp.length; i++) {
            if (row + 1 < qp.length) {
                backtrack(qp, row + 1, i);
            }
            //复位,进去的机要复位出来
            qp[row + 1][i] = false;
        }

    }


    public static boolean isvalid(boolean[][] qp, int row, int col) {

        int length = qp.length;
        int constant1 = col - row;
        int constant2 = col + row;
        for (int irow = 0; irow <= row; irow++) {

            if (irow != row && qp[irow][col]) {//竖的
                return false;
            }
            for (int icol = 0; icol < length; icol++) {
                if (icol != col && qp[row][icol]) {
                    return false;
                }

                if ((irow != row && icol != col) &&
                        ((icol - irow == constant1 && qp[irow][icol]) ||
                                (icol + irow == constant2 && qp[irow][icol]))) {
                    return false;
                }
            }
        }

        return true;
    }


    public static List<String> getresult(boolean[][] qp) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < qp.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < qp.length; j++) {
                if (qp[i][j])
                    sb.append("Q");
                else
                    sb.append(".");
            }
            ans.add(sb.toString());
        }
        return ans;
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

