package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;

public class CheckingIfStringIsPalindrome extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printIsPalindrome();
    }

    private static void printIsPalindrome() {
        LOGGER.log(Level.INFO, () -> String.valueOf(isPalindrome(EXAMPLE_TEXT)));
        LOGGER.log(Level.INFO, () -> String.valueOf(isPalindrome(PALINDROME)));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() -1;

        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
