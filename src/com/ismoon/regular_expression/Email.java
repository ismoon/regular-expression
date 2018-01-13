package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 13.
 */
public class Email {
    public static void main(String[] args) {
        checkEmail("mjis4341@naver.com");
        checkEmail("mjis4341@naver.@com");
        checkEmail("%%%%_aiss@naver.com");
        checkEmail("ismoon@gmail.com");
        checkEmail("ismoon@gmail.com.");
        checkEmail("1@naver.com");
        checkEmail("kk@aa.com");
    }

    private static void checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-z0-9A-Z_-]*@[a-z0-9A-Z]*.[a-zA-Z.]*$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches())
            System.out.println("Email : " + email);
        else
            System.out.println("No matching pattern : " + email);
    }
}
