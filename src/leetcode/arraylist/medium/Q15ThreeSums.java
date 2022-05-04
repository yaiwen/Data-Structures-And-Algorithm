package leetcode.arraylist.medium;

import java.util.*;
import java.util.stream.Collectors;

public class Q15ThreeSums {

    // LeetCode 15. 3 Sums
    // https://leetcode.com/problems/3sum/
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args)  {
        int[] nums = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        if (nums.length < 3) {
            return res;
        }
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[0] > 0) break;
            if (i == 0 || nums[i] != nums[i - 1]) {
                int lo = i+1, hi = nums.length-1, sum = -nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++; hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}