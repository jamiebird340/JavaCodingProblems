package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;

public class CheckingStringContainsDigits extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printStringIsDigit();
        printStringAnyMatchDigits();
        printRegexMethod();
    }

    private static void printRegexMethod() {
        LOGGER.log(Level.INFO, ()-> String.valueOf(stringMatchesDigitsRegex(EXAMPLE_TEXT)));
        LOGGER.log(Level.INFO, ()-> String.valueOf(stringMatchesDigitsRegex(String.valueOf(EXAMPLE_DIGITS))));
    }

    private static void printStringAnyMatchDigits() {
        LOGGER.log(Level.INFO, ()-> String.valueOf(stringAnyMatchDigits(EXAMPLE_TEXT)));
        LOGGER.log(Level.INFO, ()-> String.valueOf(stringAnyMatchDigits(String.valueOf(EXAMPLE_DIGITS))));
    }

    private static void printStringIsDigit() {
        LOGGER.log(Level.INFO, ()-> String.valueOf(stringIsDigit(EXAMPLE_TEXT)));
        LOGGER.log(Level.INFO, ()-> String.valueOf(stringIsDigit(String.valueOf(EXAMPLE_DIGITS))));
    }

    //Uses Character.isDigit method - loop the String characters and break the loop if false

    public static boolean stringIsDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean stringAnyMatchDigits(String str){
        return str.chars()
                .noneMatch((n -> !Character.isDigit(n)));
    }

    public static boolean stringMatchesDigitsRegex(String str){
        return str.matches("[0-9]+");
    }
}
