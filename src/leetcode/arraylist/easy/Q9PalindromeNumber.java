package leetcode.arraylist.easy;

import java.util.Arrays;

public class Q9PalindromeNumber {

    // LeetCode 9. Palindrome Number (Cannot cast to string)
    // https://leetcode.com/problems/palindrome-number/
    // Time Complexity: O(n) loop through x/2
    // Space Complexity: O(1) no additional space created
    public static void main(String[] args)  {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x<0 || (x>0 && x%10 == 0)) {
            return false;
        }

        int lengthOfX = (x ==0) ? 1 : (int)Math.log10(x) + 1;
        // palindrome if length of x is 1
        if (lengthOfX == 1) {
            return true;
        }

        // reverse x
        int reversedNum = 0;
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + (x % 10);
            x/= 10;
        }

        return reversedNum == x || reversedNum/10 == x;
    }
}
