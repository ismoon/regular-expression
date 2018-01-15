package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class Password {
    public static void main(String[] args) {
        checkPassword("");
    }

    private static void checkPassword(String password) {
        //문자, 숫자, 특수문자 포함 8 ~ 16자리
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9~!@#$%^&*()]{8,16}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Password : " + password);
        } else {
            System.out.println("No Matching Pattern : " + password);
        }
    }
}
