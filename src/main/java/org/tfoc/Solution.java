package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    private static final String OPENING_CHARS = "{[(";
    private static final String CLOSING_CHARS = "}])";

    public static boolean isValid(String s) {

        StringBuilder sb = new StringBuilder();
        int charIndex = 0;
        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if(OPENING_CHARS.indexOf(c) >= 0) {
                sb.append(c);
            } else if((
                    charIndex = CLOSING_CHARS.indexOf(c)) >= 0
                    && !sb.isEmpty()
                    && OPENING_CHARS.indexOf(sb.charAt(sb.length()-1)) == charIndex
            ) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                return false;
            }
        }
        return sb.isEmpty();
    }

}
