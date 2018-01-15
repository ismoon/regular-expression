package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class Slug {
    public static void main(String[] args) {
        checkSlugUrl("my-title-here");
        checkSlugUrl("my_title_here");
    }

    private static void checkSlugUrl(String url) {
        Pattern pattern = Pattern.compile("^[a-z0-9-]+$");
        Matcher matcher = pattern.matcher(url);

        if (matcher.matches()) {
            System.out.println("Slug URL : " + url);
        } else {
            System.out.println("No Matching Pattern : " + url);
        }
    }
}
