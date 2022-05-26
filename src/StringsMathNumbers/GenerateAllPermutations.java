package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;

public class GenerateAllPermutations extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printPermutations();
    }

    private static void printPermutations() {
        permuteAndPrint(ABC);
    }

    public static void permuteAndPrint(String str) {
        permuteAndPrint("", str);
    }

    private static void permuteAndPrint(String prefix, String str) {
        int n = str.length();

        if (n == 0) {
            LOGGER.log(Level.INFO, () -> prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }
}
