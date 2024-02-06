package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    private static final String OPENING_CHARS = "{[(";
    private static final String CLOSING_CHARS = "}])";

    public static boolean isValid(String s) {

        String remaining = "";
        int charIndex = 0;
        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if(OPENING_CHARS.indexOf(c) >= 0) {
                remaining+=c;
            } else if((charIndex = CLOSING_CHARS.indexOf(c)) >= 0 && remaining.length() > 0 && OPENING_CHARS.indexOf(remaining.charAt(remaining.length()-1)) == charIndex) {
                remaining = remaining.substring(0, remaining.length()-1);
            } else {
                return false;
            }
        }
        return remaining.isEmpty();
    }

}
