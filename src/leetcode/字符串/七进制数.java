package leetcode.字符串;

public class 七进制数 {

    public static void main(String[] args) {
        convertToBase7(-7);
    }

    public static String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (num < 0) {
            sb.append("-");
            num = -num;
            i = 1;
        }

        while (num >= 7) {
            sb.insert(i,num % 7);
            num /= 7;
        }
        sb.insert(i,num);
        return sb.toString();
    }
}
