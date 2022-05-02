package leetcode.arraylist.easy;

import java.util.Arrays;

public class Q1920BuildArrayFromPermutation {

    // LeetCode 1920. Build Array From Permutation
    // https://leetcode.com/problems/build-array-from-permutation/
    // Time Complexity: O(n) length of nums size
    // Space Complexity: O(n) int[] created
    public static void main(String[] args)  {
        int[] nums = new int[]{1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] newArray = new int[nums.length * 2];

        for (int i=0;i<nums.length;i++) {
            newArray[i] = newArray[i+nums.length] = nums[i];
        }
        return newArray;
    }
}
