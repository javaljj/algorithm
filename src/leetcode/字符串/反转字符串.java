package leetcode.字符串;

public class 反转字符串 {

    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (j > i) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
