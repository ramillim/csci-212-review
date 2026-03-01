package org.csci212.exam1;

/**
 * This is a 1-dimensional array practice problem for Learning Objective ARR.
 * This is from CodingBat Array-3 -> <a href="https://codingbat.com/prob/p158767">canBalance</a>
 */
public class CanBalanceArray {
    public static void main(String[] args) {
        // Test cases that return true
        System.out.println("Return true:");
        System.out.println(canBalance(new int[] {1, 1, 1, 2, 1} ));
        System.out.println(canBalance(new int[] {10, 10} ));
        System.out.println(canBalance(new int[] {10, 0, 1, -1, 10} ));
        System.out.println(canBalance(new int[] {1, 2, 3, 1, 0, 2, 3} ));

        // Test cases that return false
        System.out.println("\nReturn false:");
        System.out.println(canBalance(new int[] {1} ));
        System.out.println(canBalance(new int[] {1, 2, 3, 1, 0, 1, 3} ));
        System.out.println(canBalance(new int[] {2, 1, 1, 2, 1} ));
        System.out.println(canBalance(new int[] {2, 1, 1, 1, 4} ));
        System.out.println(canBalance(new int[] {2, 3, 4, 1, 2} ));
    }

    /**
     * Given a non-empty array, return true if there is a place to split the array so that the sum
     * of the numbers on one side is equal to the sum of the numbers on the other side.
     *
     * @param nums An array of integers that can be positive, negative, or zero.
     *
     * @return true if there is a place to split the array so that the sum of the numbers on one
     * side is equal to the sum of the numbers on the other side, otherwise return false.
     */
    public static boolean canBalance(int[] nums) {
        // Algorithm explanation:
        // This solution uses nested loops. The outer loop iterates through each element in the
        // array and sums the elements to the left of the split point (exclusive) and then sums
        // the elements to the right of the split point (inclusive).
        // If the sums are equal, the method returns true. Otherwise, it performs another iteration
        // of the outer loop until true is returned or all elements have been iterated through.
        // If the outer loop is exited with no split point is found, the method returns false.

        for (int splitIndex = 0; splitIndex < nums.length; splitIndex++) {
            int leftSum = 0;
            int rightSum = 0;

            // Sums of integers to the left of the split point (exclusive).
            for (int j = 0; j < splitIndex; j++)
                leftSum += nums[j];

            // Sums of integers to the right of the split point (inclusive).
            for (int k = splitIndex; k < nums.length; k++)
                rightSum += nums[k];

            if (leftSum == rightSum)
                return true;
        }

        return false;
    }
}
