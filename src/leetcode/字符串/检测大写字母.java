package leetcode.字符串;

public class 检测大写字母 {
    public static void main(String[] args) {

    }
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        boolean isBig = false;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) > 'A' && word.charAt(i) < 'Z') {
                return false;
            }
        }
        return true;

    }
}
