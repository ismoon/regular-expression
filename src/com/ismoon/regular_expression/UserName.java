package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class UserName {
    public static void main(String[] args) {
        checkUserName("ismoon");
        checkUserName("무닌수");
        checkUserName("_insu123");
        checkUserName("mjis-4341");
        checkUserName("mjis-4341-jjjessc-dkekfkdkk");
    }

    private static void checkUserName(String userName) {
        // 영문자, 숫자, 언더스코어( _ ), 하이픈( - ) 3 ~ 6 자리
        Pattern pattern = Pattern.compile("^[a-z0-9_-]{3,16}$");
        Matcher matcher = pattern.matcher(userName);

        if (matcher.matches()) {
            System.out.println("User Name : " + userName);
        } else {
            System.out.println("No Matching Pattern" + userName);
        }
    }
}
