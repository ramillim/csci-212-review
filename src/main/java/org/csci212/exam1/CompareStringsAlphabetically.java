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
        // Or simply use int minLength = Math.min(s1.length(), s2.length());

        int minLength;
        if (s1.length() < s2.length()) {
            minLength = s1.length();
        } else {
            minLength = s2.length();
        }

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {
                return true;
            } else if (c1 > c2) {
                return false;
            }
        }
        // If one string is a prefix of the other, the shorter string comes first.
        // If s1 is shorter or equal to s2, then it's in alphabetical order.
        return s1.length() <= s2.length();
    }
}
