package leetcode.array;

import java.util.Arrays;

//66. 加一
public class 加一 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    public static int[] plusOne(int[] digits) {

        boolean is9 = true;
        for (int i = 0; i < digits.length; i++) {

            if (digits[i] != 9)
                is9 = false;
        }
        if (is9) {
            int[] i = new int[digits.length + 1];
            i[0] = 1;
            return i;
        }

        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 10) {
                digits[i - 1] += 1;
                digits[i] = 0;
            }
        }
        return digits;
    }
}
