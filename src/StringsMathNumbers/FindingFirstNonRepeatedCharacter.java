package StringsMathNumbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindingFirstNonRepeatedCharacter {

    static final Logger LOGGER = Logger.getLogger("");

    private static final String EXAMPLE_TEXT = "example_text_1234";

    public static void main(String[] args) {
        printFirstNonRepeatingCharacter();
    }

    public static void printFirstNonRepeatingCharacter(){
        LOGGER.log(Level.INFO, ()-> String.valueOf(firstNonRepeatedCharacter(EXAMPLE_TEXT)));
    }

    public static char firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry: chars.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }
}
