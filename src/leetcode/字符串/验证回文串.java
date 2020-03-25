package leetcode.字符串;

public class 验证回文串 {

    public static void main(String[] args) {
        isPalindrome("0P");
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reverse = new StringBuilder(s).reverse().toString();
        if (s.equals(reverse)) {
            return true;
        }
        return false;
    }
}
