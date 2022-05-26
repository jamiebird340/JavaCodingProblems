package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;

public class FindingFirstNonRepeatedCharacter extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printFirstNonRepeatingCharacter();
    }

    //This method uses a LinkedHashMap rather than a hash map
    //The reason for this is HashMap will return the shortest string of characters but LinkedHashMap will return -
    //the first key with a value = 1

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
