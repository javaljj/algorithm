package jzoffer;

public class 斐波那契数列 {
    public int fib(int n) {
        int first = 1;
        int second = 2;
        if (n < 2)
            return first;
        if (n == 2)
            return second;
        int ans = 0;
        for (int i = 3; i < n; i++) {
            ans = (first + second)% 1000000007;
            first = second;
            second = ans;
        }
        return ans;

    }
}
