package jzoffer;

public class 打印从1到最大的n位数 {

    public static void main(String[] args) {
        System.out.println(printNumbers(2));
    }

    public static int[] printNumbers(int n) {
        int len = 0;
        for (int i = 0; i < n; i++) {
            len = len + 9 * 1 << i;
        }
        int[] asn = new int[len];
        for (int i = 0; i < len; i++) {
            asn[i] = i;
        }
        return asn;

    }
}
