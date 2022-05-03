package leetcode.arraylist.easy;

public class Q35SearchInsertPositionSol1 {

    // LeetCode 35 Search Insert Position Solution 1
    // https://leetcode.com/problems/search-insert-position/
    // Time Complexity: O(n) loop through half of nums
    // Space Complexity: O(1)
    public static void main(String[] args)  {
        int[] nums = new int[]{1};
        System.out.println(searchInsert(nums,0));
    }

    public static int searchInsert(int[] nums, int target) {
        int frontIdx = 0;
        if (nums.length == 1) {
            if (nums[frontIdx] == target) {
                return frontIdx;
            } else if (target < nums[frontIdx]) {
                return frontIdx;
            } else {
                return frontIdx+1;
            }
        }

        for (int i=0; i<nums.length-1; i++) {
            if (nums[frontIdx] == target) {
                return frontIdx;
            } else if (target < nums[frontIdx]) {
                return frontIdx;
            } else if (nums[frontIdx+1] == target) {
                return frontIdx+1;
            } else if ((target > nums[frontIdx]) && (target < nums[frontIdx+1])) {
                return frontIdx+1;
            } else {
                frontIdx++;
            }
        }

        return nums.length;
    }
}
