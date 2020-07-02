package com.jpoint.raiffeisen;

/**
 * String compression solution without Stream API
 */
public class StringCompressionSolution implements StringCompression {

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
    public String compress(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer result = new StringBuffer();
        char symbol = str.charAt(0);
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == symbol) {
                count++;
            } else {
                collectResult(symbol, count, result);
                symbol = ch;
                count = 1;
            }
        }
        collectResult(symbol, count, result);
        return result.toString();
    }
}
