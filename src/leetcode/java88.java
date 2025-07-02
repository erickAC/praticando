package leetcode;

import java.util.Arrays;

public class java88 {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6},  3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];
        int count = 0;

        for (int item : nums1) {
            if (item != 0) {
                nums1[count] = item;
                count++;
            }

        }

        for (int item : nums2) {
            if (item != 0) {
                if (count < result.length) {
                    nums1[count] = item;
                }
                count++;
            }
        }

        System.out.println(Arrays.toString(nums1));


        count = 0;
        for (int item : nums1) {
            if (count < nums1.length) {

                if (count + 1 < nums1.length || count - 1 > nums1.length) {
                    System.out.println("entrou");
                    if (item <= nums1[count + 1] && item >= nums1[count - 1]) {
                        System.out.println("a");
                        nums1[count] = item;

                    }
                }
            }
            count++;

        }

        System.out.println(Arrays.toString(nums1));


    }
}
