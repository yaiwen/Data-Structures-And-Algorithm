package arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SortedSquareArray {

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
        for (int i=array.length-1; i>0; i--) {
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
        newArray[0] = Math.abs(array[smallerIdx]) * Math.abs(array[smallerIdx]);
        return newArray;
    }
}
