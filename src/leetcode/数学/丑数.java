package leetcode.数学;

public class 丑数 {

    public static void main(String[] args) {
        System.out.println(isUgly(1));
    }

    public static boolean isUgly(int num) {

        while (num != 1) {
            int tmp = num;
            if (num % 2 == 0) {
                num /= 2;
            }
            if (num % 3 == 0) {
                num /= 3;
            }
            if (num % 5 == 0) {
                num /= 5;
            }
            if (tmp == num)
                return false;
        }
        return true;

    }

}
