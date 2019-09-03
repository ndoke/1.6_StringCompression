package com.training;

/**
 * {@link StringCompression} has a method to compress a given string.
 * {@link StringCompression#compressString(String)} returns a compressed
 * version of a given string.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class StringCompression {
    /**
     * Returns a compressed version of the given string
     *
     * @param input string to be compressed
     * @return compressed string
     */
    public String compressString(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                sb.append(input.charAt(i - 1));
                sb.append(count);
                count = 0;
            }
            count++;
        }

        int lastIndex = input.length() - 1;
        if (input.charAt(lastIndex) != input.charAt(lastIndex - 1)) {
            count = 1;
        }

        sb.append(input.charAt(lastIndex));
        sb.append(count);

        String compressedInput = sb.toString();
        return (compressedInput.length() < input.length()) ? compressedInput : input;
    }
}
