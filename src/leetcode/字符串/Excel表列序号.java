package leetcode.字符串;

public class Excel表列序号 {

    public int titleToNumber(String s) {

        int ans = 0;
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            ans += (c - 'A' + 1) * Math.pow(26, index);
            index++;
        }

        return ans;
    }
}
