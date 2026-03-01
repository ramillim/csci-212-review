package org.csci212.exam1;


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
        // Test your methods here.
    }
}
