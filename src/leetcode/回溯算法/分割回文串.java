package leetcode.回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 分割回文串 {
    static List<List<String>> lists = new ArrayList<>();

    public static void main(String[] args) {
        partition("cdd");
    }

    public static List<List<String>> partition(String s) {

        for (int i = 1; i <= s.length(); i++) {
            dfs(s.substring(i), s.substring(0, i), new ArrayList<>());
        }
        return lists;
    }

    public static void dfs(String all, String curr, List<String> list) {
        //剪枝，如果有一个失败的就是错的
        if (!isCir(curr)) {
            return;
        }
        list.add(curr);
        if (all.length() == 0) {
            //加入
            lists.add(new ArrayList<>(list));
            list.remove(list.lastIndexOf(curr));
            return;
        }

        for (int i = 1; i <= all.length(); i++) {
            dfs(all.substring(i), all.substring(0, i), list);
        }
        list.remove(list.lastIndexOf(curr));
    }

    private static boolean isCir(String s) {
        if (s.equals(""))
            return true;

        int start = 0, end = s.length()-1;
        while (end > start) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

}
