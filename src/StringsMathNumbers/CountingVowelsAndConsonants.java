package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;
import javafx.util.Pair;

import java.util.logging.Level;

public class CountingVowelsAndConsonants extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printConstVowelsAsPair();
    }

    private static void printConstVowelsAsPair() {
        LOGGER.log(Level.INFO, () -> String.valueOf(countVowelsAndConsonantsPair(EXAMPLE_TEXT)));
        LOGGER.log(Level.INFO, () -> String.valueOf(countVowelsAndConsonantsPair(EXAMPLE_SENTENCE)));
        LOGGER.log(Level.INFO, () -> String.valueOf(countVowelsAndConsonantsPair(String.valueOf(EXAMPLE_DIGITS))));
    }

    public static Pair<Integer, Integer> countVowelsAndConsonantsPair(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        return new Pair<>(vowels, consonants);
    }
}
