package leetcode.arraylist.easy;

public class Q26RemoveDuplicatesFromSortedArray {

    // LeetCode 26. Remove Duplicates From Sorted Array
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    // Time Complexity: O(n) length of input nums
    // Space Complexity: O(1)
    public static void main(String[] args)  {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int smallestIdx = 0;
        int value = nums[0];
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > value) {
                value = nums[i];
                smallestIdx += 1;
            }
            nums[smallestIdx] = value;
        }
        return smallestIdx+1;
    }
}
