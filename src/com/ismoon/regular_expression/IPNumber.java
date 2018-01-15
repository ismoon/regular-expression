package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class IPNumber {
    public static void main(String[] args) {
         checkIPNumber("192.182.0.12");
         checkIPNumber("1922.182.0.12");
         checkIPNumber("19.182.0000.12");
         checkIPNumber("10.182.0.12");
         checkIPNumber("1.182.0.12");
         checkIPNumber("256.60.124.136");
    }

    private static void checkIPNumber(String ipNumber) {
//        Pattern pattern = Pattern.compile("^\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}$");
        Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher matcher = pattern.matcher(ipNumber);

        if (matcher.matches()) {
            System.out.println("IP Number : " + ipNumber);
        } else {
            System.out.println("No Matching Pattern : " + ipNumber);
        }
    }
}
