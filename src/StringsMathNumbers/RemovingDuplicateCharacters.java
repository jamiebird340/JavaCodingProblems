package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class RemovingDuplicateCharacters extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printRemoveDuplicates();
    }

    private static void printRemoveDuplicates() {
        LOGGER.log(Level.INFO, () -> removeDuplicates(EXAMPLE_SENTENCE));
        LOGGER.log(Level.INFO, () -> removeDuplicatesStream(EXAMPLE_SENTENCE));

    }

    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray(); //or use charAt(i)
        StringBuilder sb = new StringBuilder();

        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static String removeDuplicatesStream(String str){
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }
}
