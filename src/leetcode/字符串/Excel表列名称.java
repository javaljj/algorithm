package leetcode.字符串;

public class Excel表列名称 {
    public static void main(String[] args) {
        convertToTitle(18278);
    }

    public static String convertToTitle(int n) {


        //冯z进1
        StringBuilder stringBuilder = new StringBuilder();

        while (n > 0) {

            int mod = (n - 1) % 26;

            stringBuilder.append((char)('A' + mod));
            n = (n - 1) / 26;
        }
        return stringBuilder.reverse().toString();
    }

}
