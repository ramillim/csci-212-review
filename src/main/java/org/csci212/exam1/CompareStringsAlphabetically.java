package org.csci212.exam1;

public class CompareStringsAlphabetically {
    public static void main(String[] args) {
        // Test cases that return true
        System.out.println("Return true:");
        System.out.println(isInAlphabeticalOrder("a", "b"));
        System.out.println(isInAlphabeticalOrder("5", "6"));
        System.out.println(isInAlphabeticalOrder("banana", "bananas"));
        System.out.println(isInAlphabeticalOrder("banana", "oranges"));
        System.out.println(isInAlphabeticalOrder("oranges", "oranges"));
        System.out.println(isInAlphabeticalOrder("", "oranges"));

        // Test cases that return false
        System.out.println("Return false:");
        System.out.println(isInAlphabeticalOrder("b", "a"));
        System.out.println(isInAlphabeticalOrder("6", "5"));
        System.out.println(isInAlphabeticalOrder("oranges", "bananas"));
    }

    /**
     * Compares two strings to determine if they are in alphabetical order.
     *
     * @param s1 The first string
     * @param s2 The second string
     * @return true if s1 and s2 are equal or if s1 comes before s2 alphabetically, otherwise,
     * return false.
     */
    public static boolean isInAlphabeticalOrder(String s1, String s2) {
        throw new UnsupportedOperationException("Delete this line and write your solution here.");
    }
}
