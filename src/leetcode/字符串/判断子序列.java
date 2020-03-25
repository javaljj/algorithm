package leetcode.字符串;

public class 判断子序列 {

    public static void main(String[] args) {
        isSubsequence("axc", "ahbgdc");
    }

    public static boolean isSubsequence(String s, String t) {

        int si = 0, ti = 0;
        //没对上，移动t,对上了，移动 s和t
        while (s.length() - 1 >= si && t.length() - 1 >= ti) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
                ti++;
            } else {
                ti++;
            }
        }

        if (si < s.length()) {
            return false;
        }
        return true;
    }
}
