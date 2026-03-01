package org.csci212.exam1;

/**
 * This is a 1-dimensional array practice problem for Learning Objective ARR.
 * This is from CodingBat Array-3 -> <a href="https://codingbat.com/prob/p158767">canBalance</a>
 */
public class CanBalanceArray {
    public static void main(String[] args) {
        // Test cases that return true
        System.out.println(canBalance(new int[] {1, 1, 1, 2, 1} ));
        System.out.println(canBalance(new int[] {10, 10} ));
        System.out.println(canBalance(new int[] {10, 0, 1, -1, 10} ));
        System.out.println(canBalance(new int[] {1, 2, 3, 1, 0, 2, 3} ));


        // Test cases that return false
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
        throw new UnsupportedOperationException("Delete this line and write your solution here.");
    }
}
