package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class HexValue {
    public static void main(String[] args) {
        checkHexValue("#aaaaaa");
        checkHexValue("aaaaaa");
        checkHexValue("#ffffff");
        checkHexValue("#ffff");
        checkHexValue("#fff");
        checkHexValue("fff");
        checkHexValue("#1aadkk");
    }

    private static void checkHexValue(String value) {
        Pattern pattern = Pattern.compile("^#?([a-f0-9]{6}|[a-f0-9]{3})$");
        Matcher matcher = pattern.matcher(value);

        if (matcher.matches()) {
            System.out.println("Hex : " + value);
        } else {
            System.out.println("No Matching Pattern : " + value);
        }
    }
}
