package leetcode.堆;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class 超级丑数 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1689));
        System.out.println(nthUglyNumber1(1689));
//        System.out.println(612220032);
//        System.out.println(Integer.MAX_VALUE);
    }


    public static int nthUglyNumber1(int n) {
        int[] nums = new int[1690];

        nums[0] = 1;
        int ugly, i2 = 0, i3 = 0, i5 = 0;

        for(int i = 1; i < 1690; ++i) {
            ugly = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3), nums[i5] * 5);
            nums[i] = ugly;

            if (ugly == nums[i2] * 2) ++i2;
            if (ugly == nums[i3] * 3) ++i3;
            if (ugly == nums[i5] * 5) ++i5;
        }
        return nums[n - 1];

    }

    public static int nthUglyNumber(int n) {
        Set<Long> hash = new HashSet<>();
        PriorityQueue<Long> ans = new PriorityQueue<>();
        ans.add(1L);
        int count = 0;
        while (ans.size() > 0) {
            Long tmp = ans.poll();
           // System.out.println(count+"___"+tmp);
            if (count == n - 1)
                return Math.toIntExact(tmp);
            count++;
            if (!hash.contains(tmp * 2) ) {
                ans.add(tmp * 2);
                hash.add(tmp * 2);
            }
            if (!hash.contains(tmp * 3)) {
                ans.add(tmp * 3);
                hash.add(tmp * 3);
            }
            if (!hash.contains(tmp * 5)) {
                ans.add(tmp * 5);
                hash.add(tmp * 5);
            }
        }
        return 0;
    }


}
