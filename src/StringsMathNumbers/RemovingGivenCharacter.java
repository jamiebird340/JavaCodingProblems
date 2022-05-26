package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemovingGivenCharacter extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printRemoveCharacter();
        printRemoveCharacterAlt();
    }

    private static void printRemoveCharacterAlt() {
        LOGGER.log(Level.INFO, () -> removeCharacterAlt(EXAMPLE_SENTENCE.toLowerCase(), 'o'));
    }

    private static void printRemoveCharacter() {
        LOGGER.log(Level.INFO, () -> removeCharacter(EXAMPLE_SENTENCE.toLowerCase(), 'o'));
    }

    //This could be adapted to removing specific strings rather than characters too

    public static String removeCharacter(String str, char ch) {
        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    public static String removeCharacterAlt(String str, char ch) {
        return str.chars().filter(c -> c != ch).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }

}
