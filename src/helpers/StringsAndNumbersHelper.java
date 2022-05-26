package helpers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class StringsAndNumbersHelper {
    public static final Logger LOGGER = Logger.getLogger("");
    public static final Pattern PATTERN = Pattern.compile(" +");
    public static final String EXAMPLE_TEXT = "example_text_1234";
    public static final String EXAMPLE_SENTENCE = "My Bonnie Lies Over The Ocean";
    public static final String WHITE_SPACE = " ";
    public static final Integer EXAMPLE_DIGITS = 1234567890;
    public static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static final String TO_INT = "453";
    public static final String TO_LONG = "45234223233";
    public static final String TO_FLOAT = "45.876";
    public static final String TO_DOUBLE = "13.8765D";

}
