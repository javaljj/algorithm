package leetcode.字符串;

public class 将数组分成和相等的三个部分 {

    public boolean canThreePartsEqualSum(int[] A) {
        int count = sum(A, 0, A.length);
        if (count % 3 != 0)
            return false;
        int part = count / 3;

        //double point
        int l = 0, r = A.length - 1, first = 0, last = 0;
        boolean canbreak1 = false, canbreak2 = false;
        while (r > l) {


            if (first != part) {
                first += A[l];
                first++;
            } else {
                canbreak1 = true;
            }

            if (last != part) {
                last += A[r];
                last--;
            } else {
                canbreak2 = true;
            }

            if (canbreak1 && canbreak2)
                break;
            if (r == l)
                return false;
        }

        if (sum(A, l + 1, r) != part)
            return false;

        return true;

    }


    public int sum(int[] sums, int left, int right) {
        int count = 0;
        for (int i = left; i < right; i++) {
            count += sums[i];
        }
        return count;
    }
}
