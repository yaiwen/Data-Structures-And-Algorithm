package leetcode.arraylist.easy;

import java.util.Arrays;

public class Q1929ConcatenationOfArray {

    // LeetCode 1929. ConcatenationOfArray
    // https://leetcode.com/problems/concatenation-of-array/
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
