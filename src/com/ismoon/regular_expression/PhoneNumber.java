package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon
 * @since 2017-12-28.
 */
public class PhoneNumber {
    public static void main(String[] args) {
        checkPhoneNumber("01041794341");
        checkPhoneNumber("010417294341");
        checkPhoneNumber("0114941341");
        checkPhoneNumber("01241794341");
        checkPhoneNumber("01341794341");
        checkPhoneNumber("01441794341");
        checkPhoneNumber("01541794341");
        checkPhoneNumber("01641794341");
        checkPhoneNumber("01741794341");
        checkPhoneNumber("01841794341");
    }

    private static void checkPhoneNumber(String phoneNum){
        Pattern pattern = Pattern.compile("(01[016789])(\\d{3,4})(\\d{4})");
        Matcher matcher = pattern.matcher(phoneNum);

        if (matcher.find() && matcher.groupCount() == 3)
            System.out.println(matcher.group(1) + "-" + matcher.group(2) + "-" + matcher.group(3));
        else
            System.out.println("No Matching Pattern : " + phoneNum);
    }
}
