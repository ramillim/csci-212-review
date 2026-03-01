package org.csci212.exam1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This practice problem exercises the ARR, LIST1, and STR learning objectives.
 *
 * Recall that methods that have been taught in class up to this point include the following. The
 * duplicate methods are for overloaded methods (same name, different parameters).
 *
 * String: charAt, equals, indexOf, length, substring, substring
 * ArrayList: add, add, get, indexOf, remove, set, size
 */
public class AlphabetizeTwoStringLists {
    public static void main(String[] args) {
        // Test Case
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(
            "Elizabeta", "Muireann", "Khasan", "Jiang", "Zorica"
        ));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(
            "Stanislav", "Humberto", "Megan", "Dhaval", "Eleanore"
        ));

        String[] result = alphabetize(list1, list2);
        System.out.println(Arrays.toString(result));
        // The result should print:
        // ["Dhaval", "Eleanore", "Elizabeta", "Humberto", "Jiang", "Khasan", "Megan", "Muireann", "Stanislav", "Zorica"]
    }

    /**
     * Alphabetizes two lists of strings.
     *
     * @param list1 A non-empty list of strings with names consisting entirely of letters.
     * @param list2 A non-empty list of strings with names consisting entirely of letters.
     * @return An array containing the names in alphabetical order from both lists.
     */
    public static String[] alphabetize(ArrayList<String> list1, ArrayList<String> list2) {
        throw new UnsupportedOperationException("Delete this line and write your solution here.");
    }
}
