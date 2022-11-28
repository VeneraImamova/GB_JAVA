package HW_1;

public class Task_1 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{2};
        int m = 0, n = 1;
        int lastInd = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[lastInd] = nums2[n - 1];
                n -= 1;
            } else {
                nums1[lastInd] = nums1[m - 1];
                nums1[m - 1] = nums2[n - 1];
                m -= 1;
            }
            lastInd -= 1;
        }


        while (n > 0) {
            nums1[lastInd] = nums2[n - 1];
            n -= 1;
            lastInd -= 1;
        }


        for (
                int k = 0;
                k < nums1.length; k++) {
            System.out.print(nums1[k]);
        }


    }

}
