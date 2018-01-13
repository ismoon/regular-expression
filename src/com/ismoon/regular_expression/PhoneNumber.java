package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon
 * @since 2017-12-28.
 */
public class PhoneNumber {
    public static void main(String[] args) {
        validationPhoneNumber("01041794341");
        validationPhoneNumber("010417294341");
        validationPhoneNumber("0114941341");
        validationPhoneNumber("01241794341");
        validationPhoneNumber("01341794341");
        validationPhoneNumber("01441794341");
        validationPhoneNumber("01541794341");
        validationPhoneNumber("01641794341");
        validationPhoneNumber("01741794341");
        validationPhoneNumber("01841794341");
    }

    public static void validationPhoneNumber(String phoneNum){
//        Pattern pattern = Pattern.compile("(\\d{3})(\\d{3,4})(\\d{4})");
        Pattern pattern = Pattern.compile("(01[016789])(\\d{3,4})(\\d{4})");
//        Pattern pattern = Pattern.compile("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})(\\d{4}$)");
        Matcher matcher = pattern.matcher(phoneNum);

        if (matcher.find() && matcher.groupCount() == 3)
            System.out.println(matcher.group(1) + "-" + matcher.group(2) + "-" + matcher.group(3));

//        System.out.println("");
    }
}
