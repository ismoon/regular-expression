package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class HtmlTag {
    public static void main(String[] args) {
        checkHtmlTag("<a href=\"http://net.tutsplus.com/\"> Nettuts+</a>");
        checkHtmlTag("<img src=\"img.jpg\" alt=\"My image>\" />");
    }

    private static void checkHtmlTag(String htmlTag) {
        Pattern pattern = Pattern.compile("^<([a-z]+)([^<]+)*(?:>(.*)<\\/\\1>|\\s+\\/>)$");
        Matcher matcher = pattern.matcher(htmlTag);

        if (matcher.matches()) {
            System.out.println("HTML : " + htmlTag);
        } else {
            System.out.println("No Matching Pattern : " + htmlTag);
        }
    }
}
