package StringsMathNumbers;

import helpers.StringsAndNumbersHelper;

import java.util.logging.Level;

public class ConvertingStringIntoOtherTypes extends StringsAndNumbersHelper {

    public static void main(String[] args) {
        printInt();
        printLong();
        printFloat();
        printDouble();
    }

    private static void printDouble() {
        LOGGER.log(Level.INFO, () -> String.valueOf(convertStringToDouble(TO_DOUBLE)));
    }

    private static void printFloat() {
        LOGGER.log(Level.INFO, () -> String.valueOf(convertStringToFloat(TO_FLOAT)));
    }

    private static void printLong() {
        LOGGER.log(Level.INFO, () -> String.valueOf(convertStringToLong(TO_LONG)));
    }

    private static void printInt() {
        LOGGER.log(Level.INFO, () -> String.valueOf(convertStringToInt(TO_INT)));
    }

    private static Integer convertStringToInt(String str) {
        return Integer.parseInt(str);
    }

    private static Long convertStringToLong(String str) {
        return Long.parseLong(str);
    }

    private static Float convertStringToFloat(String str) {
        return Float.parseFloat(str);
    }

    private static Double convertStringToDouble(String str) {
        return Double.parseDouble(str);
    }
}
