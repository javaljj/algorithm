package leetcode.array;

public class 寻找两个有序数组的中位数1 {

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4});
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int step = (nums1.length + nums2.length) / 2;
        int[] ans = new int[step + 1];
        int a = 0, b = 0;
        while (step >= 0) {
            Integer tmpa = null, tmpb = null;

            if (a < nums1.length) {
                tmpa = nums1[a];
            }
            if (b < nums2.length) {
                tmpb = nums2[b];
            }
            if (tmpa == null || (tmpb != null && tmpa > tmpb)) {
                ans[step] = tmpb;
                b++;
            } else {
                ans[step] = tmpa;
                a++;
            }
            step--;
        }

        return (nums1.length + nums2.length) % 2 == 0 ? (ans[0] + ans[1]) / 2.0 : ans[0];
    }
}
