package com.ismoon.regular_expression.checker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 15.
 */
public class StdRegexpChecker extends AbstractRegexpChecker {
    @Override
    public void checkRegexp(String input) {

        if (null == this.regexp || input.equals("")) {
            throw new IllegalArgumentException();
        }

        Pattern pattern = Pattern.compile(this.regexp);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Matching Pattern : " + input);
        } else {
            System.out.println("No Matching Pattern : " + input);
        }
    }
}
