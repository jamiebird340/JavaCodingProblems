package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;

public class RemovingWhiteSpaceFromStrings extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printStringWithoutWhitespace();
    }

    private static void printStringWithoutWhitespace() {
        LOGGER.log(Level.INFO, () -> removeWhiteSpaces(EXAMPLE_SENTENCE));
    }

    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
}
