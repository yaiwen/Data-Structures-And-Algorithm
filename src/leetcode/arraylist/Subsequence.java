package leetcode.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Subsequence {

    // Time Complexity: O(n) to traverse the main array
    // Space Complexity: O(1)
    public static void main(String[] args)  {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int a = 0;
        int s = 0;
        while (a < array.size() && s < sequence.size()) {
            if (Objects.equals(array.get(a), sequence.get(s))) {
                s++;
            }
            a++;
        }
        return s == sequence.size();
    }
}
