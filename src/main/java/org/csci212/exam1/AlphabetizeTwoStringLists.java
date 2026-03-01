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
                "Elizabeta", "Khasan", "Jiang", "Zorica"
        ));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(
                "Stanislav", "Humberto", "Megan", "Dhaval", "Eleanore"
        ));

        String[] result = alphabetize(list1, list2);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(result, new String[] {"Dhaval", "Eleanore", "Elizabeta",
                "Humberto", "Jiang", "Khasan", "Megan", "Stanislav", "Zorica"}));
        // The result should print:
        // ["Dhaval", "Eleanore", "Elizabeta", "Humberto", "Jiang", "Khasan", "Megan", "Stanislav", "Zorica"]
        // true
    }

    /**
     * Alphabetizes two lists of strings. The lists can be of different lengths. For this solution,
     * you can use String.compareTo() to compare strings lexicographically.
     *
     * @param list1 A non-empty list of strings with names consisting entirely of letters.
     * @param list2 A non-empty list of strings with names consisting entirely of letters.
     * @return An array containing the names in alphabetical order from both lists.
     */
    public static String[] alphabetize(ArrayList<String> list1, ArrayList<String> list2) {
        return writeYourOwnAlgorithmSolution(list1, list2);
        // return useBuiltInLibrariesSolution(list1, list2);
    }

    private static String[] writeYourOwnAlgorithmSolution(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> mergedList = new ArrayList<>();

        // Merge the two lists into one. There are other ways to do this using methods that have
        // not been covered in class.
        for (String str : list1) {
            mergedList.add(str);
        }

        for (String str : list2) {
            mergedList.add(str);
        }

        // Implement a selection sort algorithm to alphabetize the lists.
        for (int i = 0; i < mergedList.size() - 1; i++) {
            // For each iteration, assume that the current element is the (alphabetical) minimum.
            int minIndex = i;

            // Iterate through the unsorted portion of the list to find the actual minimum.
            for (int j = i + 1; j < mergedList.size(); j++) {
                // If a smaller element is found, update the minimum index.
                if (mergedList.get(j).compareTo(mergedList.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the minimum element to its correct position in the list.
            String temp = mergedList.get(minIndex);
            mergedList.set(minIndex, mergedList.get(i));
            mergedList.set(i, temp);
        }

        // Convert the ArrayList to a String array.
        // Again, there's a simpler way to do this that hasn't been covered in class.
        // The following could be replaced with:
        //   return mergedList.toArray(new String[0]);
        String[] result = new String[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            result[i] = mergedList.get(i);
        }

        return result;
    }

    private static String[] useBuiltInLibrariesSolution(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> sortedList = new ArrayList<>();

        sortedList.addAll(list1);
        sortedList.addAll(list2);

        sortedList.sort(String::compareTo);
        // Alternatively: Collections.sort(sortedList);

        return sortedList.toArray(new String[0]);
    }
}
