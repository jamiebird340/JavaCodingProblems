package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class CountingDuplicateCharacters extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        countCharactersUsingMap();
        printDuplicateCharacterCount();
    }

    public static void countCharactersUsingMap() {
        LOGGER.log(Level.INFO, ()-> String.valueOf(characterMap(EXAMPLE_TEXT)));
    }

    public static Map<Character, Integer> characterMap(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    public static void printDuplicateCharacterCount(){
        LOGGER.log(Level.INFO, ()-> String.valueOf(countDuplicateCharacters(EXAMPLE_TEXT)));
    }

    public static Map<String, Integer> countDuplicateCharacters(String str){
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if(Character.charCount(cp) == 2){
                i++;
            }

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

}
