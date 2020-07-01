package com.jpoint.raiffeisen;

/**
 * Class for string compression method
 */
public class StringCompression {

    /**
     * Method to collect compression substring into string buffer
     * Format: "<count><symbol>"
     * @param symbol : repeated symbol
     * @param count : number of repetitions
     * @param sb : string buffer for resulted string
     */
    private static void collectResult(char symbol, int count, StringBuffer sb) {
        if (count > 1) {
            sb.append(count);
        }
        sb.append(symbol);
    }

    /**
     * Static method for string compression
     * @param str : source string
     * @return : compressed string
     */
    public static String stringCompression(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        StringBuffer result = new StringBuffer();
        char symbol = str.charAt(0);
        int count = 1;
        int size = str.length();
        for (int i = 1; i < size; i++)	{
            if (str.charAt(i) == symbol) {
                count++;
            } else {
                collectResult(symbol, count, result);
                symbol = str.charAt(i);
                count = 1;
            }
        }
        collectResult(symbol, count, result);
        return result.toString();
    }
}
