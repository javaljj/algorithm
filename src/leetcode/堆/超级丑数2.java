package leetcode.堆;

import java.util.Arrays;

public class 超级丑数2 {

    public static void main(String[] args) {
        System.out.println(nthSuperUglyNumber(1700, new int[]{2, 7, 13, 19}));
//        System.out.println(612220032);
//        System.out.println(Integer.MAX_VALUE);
    }

    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        int[] idnex = new int[primes.length];
        Arrays.fill(idnex, 0);

        for (int i = 1; i < n; i++) {
            int ugly =Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                ugly = Math.min(ugly, dp[idnex[j]] * primes[j]);
            }
            dp[i] = ugly;
            for (int j = 0; j < primes.length; j++) {
                if (ugly == dp[idnex[j]] * primes[j]) ++idnex[j];
            }
        }
        return dp[n-1];

    }
}
