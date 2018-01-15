package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class URL {
    public static void main(String[] args) {
        checkUrl("https://www.naver.com/");
        checkUrl("http://www.naver.com");
        checkUrl("www.naver.com/");
        checkUrl("http://google.com/some/file!.html");
        checkUrl("https://blog.outsider.ne.kr/360");
    }

    private static void checkUrl(String url) {
        Pattern pattern = Pattern.compile("^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w_\\.-]*)*\\/?$");
        Matcher matcher = pattern.matcher(url);

        if (matcher.matches()) {
            System.out.println("URL : " + url);
        } else {
            System.out.println("No Matching Pattern : " + url);
        }
    }
}
