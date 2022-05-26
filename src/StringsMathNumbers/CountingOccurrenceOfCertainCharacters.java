package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;

public class CountingOccurrenceOfCertainCharacters extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printOccurrencesUsingUsingStringReplace();
    }

    private static void printOccurrencesUsingUsingStringReplace() {
        LOGGER.log(Level.INFO, () -> String.valueOf(countOccurrencesUsingStringReplace(EXAMPLE_SENTENCE.toLowerCase(),
                'b')));
    }

    public static int countOccurrencesUsingStringReplace(String str, char ch){
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

}
