package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class java27 {

    public static void main(String[] args) {
        removeElement(new int[] {3, 2, 2, 3}, 3);
    }

    public static int removeElement(int[] nums, int val) {

        int count = 0;
        for (int item : nums) {
            if (item != val) count++;
        }

        int[] results = new int[count];

        count = 0;
        for (int item : nums) {
            if (item != val) {
                results[count] = item;
                count++;
            }
        }

        System.out.println(Arrays.toString(results));

        return val;

    }

}
