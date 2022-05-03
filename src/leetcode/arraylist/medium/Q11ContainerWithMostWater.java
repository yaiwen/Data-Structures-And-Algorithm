package leetcode.arraylist.medium;

public class Q11ContainerWithMostWater {

    // LeetCode 11. Container With Most Water
    // https://leetcode.com/problems/container-with-most-water/
    // Time Complexity: O(n) loop through half of n
    // Space Complexity: O(1)
    public static void main(String[] args)  {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int frontIdx = 0;
        int backIdx = height.length - 1;
        int maxArea = Math.min(height[frontIdx], height[backIdx]) * (backIdx - frontIdx);
        while (frontIdx != backIdx) {
            if (height[frontIdx] < height[backIdx]) {
                frontIdx++;
            } else {
                backIdx--;
            }
            maxArea = Math.max(maxArea, (Math.min(height[frontIdx], height[backIdx]) * (backIdx - frontIdx)));
        }

        return maxArea;
    }
}
