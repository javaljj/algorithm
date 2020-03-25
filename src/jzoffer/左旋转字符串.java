package jzoffer;

public class 左旋转字符串 {

    public String reverseLeftWords(String s, int n) {
        n = n % s.length();

        return s.substring(n) + s.substring(0, n);

    }
}
