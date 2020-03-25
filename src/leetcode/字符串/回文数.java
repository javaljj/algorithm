package leetcode.字符串;

public class 回文数 {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int copy = x;
        int reverse = 0;
        while (copy > 0) {
            reverse = reverse * 10 + copy % 10;
            copy /= 10;
        }
        return x == reverse;
    }
}
