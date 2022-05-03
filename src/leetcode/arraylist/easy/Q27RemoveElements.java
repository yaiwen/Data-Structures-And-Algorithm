package leetcode.arraylist.easy;

public class Q27RemoveElements {

    // LeetCode 27. Remove Elements
    // https://leetcode.com/problems/remove-element/
    // Time Complexity: O(n) loop through half of nums
    // Space Complexity: O(1)
    public static void main(String[] args)  {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(removeElement(nums,3));
    }

    public static int removeElement(int[] nums, int val) {
        int count=0;

        int frontIdx=0;
        int backIdx=nums.length-1;

        while(frontIdx<=backIdx){
            if (nums[frontIdx]==val) {
                int num = nums[frontIdx];
                nums[frontIdx] = nums[backIdx];
                nums[backIdx] = num;
                backIdx--;
            } else {
                count++;
                frontIdx++;
            }
        }

        return count;
    }
}
