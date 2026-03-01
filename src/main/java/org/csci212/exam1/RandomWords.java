package org.csci212.exam1;


import java.util.Arrays;

/**
 * This problem is from the Fall 2024 Midterm 1 review session.
 *
 * For the free-response section, you will write two static methods in the same class.
 *
 * The first method is called `makeWordFromArray`. The makeWordFromArray method takes an array of
 * strings as its parameter. It chooses one letter independently at random from each string in the
 * array starting with the first and continuing sequentially and concatenates them together to form
 * a new word, which it returns. For example, consider the following array:
 *
 * ["cap", "door", "home", "gap", "arts", "camera", "film"]
 *
 * Two possible words formed from this array are "compsci" and "program". Write the makeWordFromArray
 * method using the signature given below.
 *
 * public static String makeWordFromArray(String[] arr)
 *
 * The second method is called `makeMultipleWords`. The makeMultipleWords method uses a 2D array as
 * its parameter. It returns an array containing a word made from each row using the makeWordFromArray
 * method. For example, consider the following array:
 *
 * [["yes", "no", "up"],
 *  ["maybe", "right", "left"],
 *  ["right", "right", "left"],
 *  ["up", "right", "down"]]
 *
 * One possible array returned by this is: ["you", "are", "the", "pro"]
 *
 * Write the makeMultipleWords method using the method signature given below. You must use the
 * makeWordFromArray method appropriately in your code to receive full credit.
 *
 * public static String[] makeMultipleWords(String[][] arr2D)
 */
public class RandomWords {
    public static void main(String[] args) {
        String[][] arr2D = {
            {"yes", "no", "up"},
            {"maybe", "right", "left"},
            {"right", "right", "left"},
            {"up", "right", "down"}
        };
        String[] result = makeMultipleWords(arr2D);
        System.out.println(Arrays.toString(result));
    }

    public static String makeWordFromArray(String[] arr) {
        StringBuilder builder = new StringBuilder();

        for (String word : arr) {
            // Since Math.random() returns a double from 0.0 to 1 (exclusive), multiply it by the
            // n = length of the word and cast to an int to get an integer from 0 to n (exclusive).
            var randomIndex = (int)(Math.random() * word.length());
            var letter = word.charAt(randomIndex);
            builder.append(letter);
        }

        return builder.toString();
    }

    public static String[] makeMultipleWords(String[][] arr2D) {
        // We know that the number of elements in the resulting array is equal to the number of
        // rows in the 2D array.
        String[] result = new String[arr2D.length];

        // Iterate through each row and make a word from it. Store the result in the array at the
        // corresponding element to the row index number.
        for (int i = 0; i < arr2D.length; i++) {
            result[i] = makeWordFromArray(arr2D[i]);
        }

        return result;
    }
}
