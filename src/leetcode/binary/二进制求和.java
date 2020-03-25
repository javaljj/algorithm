package leetcode.binary;

public class 二进制求和 {
    public static void main(String[] args) {
        addBinary("1011", "1010");
    }

    public static String addBinary(String a, String b) {
        int al = a.length() - 1, bl = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (al >= 0 || bl >= 0) {
            int c = 0;

            int aaa = 0;
            if (al >= 0) {
                aaa = a.charAt(al) - '0';
            }
            int bbb = 0;
            if (bl >= 0) {
                bbb = b.charAt(bl) - '0';
            }

            c += aaa + bbb + carry;

            if (c == 3) {
                carry = 1;
                sb.insert(0, 1);
            } else if (c == 2) {
                carry = 1;
                sb.insert(0, 0);
            } else {

                sb.insert(0, c);
            }
            al--;
            bl--;
        }
        if (carry == 1)
            sb.insert(0, 1);
        return sb.toString();

    }
}
