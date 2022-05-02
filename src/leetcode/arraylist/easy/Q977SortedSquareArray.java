package leetcode.arraylist.easy;

import java.util.Arrays;

public class Q977SortedSquareArray {

    // LeetCode 977. Squares of Sorted Array
    // https://leetcode.com/problems/squares-of-a-sorted-array/
    // Time Complexity: O(n) to traverse the main array
    // Space Complexity: O(n) need to create a new int[] array
    public static void main(String[] args)  {
        int[] array = new int[]{-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));
    }

    public static int[] sortedSquaredArray(int[] array) {
        int smallerIdx = 0;
        int largerIdx = array.length - 1;

        int[] newArray = new int[array.length];
        for (int i=array.length-1; i>=0; i--) {
            int smallerValue = Math.abs(array[smallerIdx]);
            int largerValue = Math.abs(array[largerIdx]);
            if (smallerValue > largerValue) {
                newArray[i] = smallerValue * smallerValue;
                smallerIdx++;
            } else {
                newArray[i] = largerValue * largerValue;
                largerIdx--;
            }
        }
        return newArray;
    }
}
