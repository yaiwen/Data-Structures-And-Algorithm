package arraylist;

import java.util.Arrays;

public class Q1TwoSums {

    // LeetCode 1. Two Sum
    // Time Complexity: O (n log n)
    // Space Complexity: O(1)
    public static void main(String[] args)  {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoNumberSum(nums, target)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        int i = 0;
        int j = array.length - 1;

        // use binary search
        Arrays.sort(array);
        while (i < j) {
            if (array[i] + array[j] == targetSum) {
                return new int[] {array[i], array[j]};
            } else if (array[i] + array[j] > targetSum) {
                j--;
            } else if (array[i] + array[j] < targetSum) {
                i++;
            }
        }

        return new int[0];
    }
}
