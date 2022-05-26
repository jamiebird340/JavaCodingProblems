package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;
import java.util.stream.Collectors;

public class ReversingLettersAndWords extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printReversedString();
        printReversedStringPattern();
        printFullReverse();
    }

    private static void printFullReverse() {
        LOGGER.log(Level.INFO, ()-> fullReverse(EXAMPLE_SENTENCE));
    }

    private static void printReversedStringPattern() {
        LOGGER.log(Level.INFO, () -> returnReversedStringsPattern(EXAMPLE_TEXT));
    }

    private static void printReversedString() {
        LOGGER.log(Level.INFO, () -> returnReverseLettersFromString(EXAMPLE_TEXT));
    }

    private static String returnReverseLettersFromString(String str) {
        String[] words = str.split(WHITE_SPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITE_SPACE);
        }
        return reversedString.toString();
    }

    //This can also be written as the following using patterns:

    public static String returnReversedStringsPattern(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(WHITE_SPACE));
    }

    //This will reverse the letters within your string and your sentence itself

    public static String fullReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
