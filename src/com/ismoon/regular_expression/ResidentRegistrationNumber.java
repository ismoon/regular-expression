package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class ResidentRegistrationNumber {
    public static void main(String[] args) {
        checkBirthDate("890525");
        checkBirthDate("8905251");
        checkBirthDate("19890525");
        checkBirthDate("90525");
        checkBirthDate("900925");
        checkRRN("8905251111111");
        checkRRN("8905252222222");
        checkRRN("8905253333333");
        checkRRN("8905254444444");
        checkRRN("8905255555555");
        checkRRN("89052545678901");
        checkRRN("890525111778");
    }

    private static void checkBirthDate(String birthDate) {
        Pattern pattern = Pattern.compile("^\\d{6}");
        Matcher matcher = pattern.matcher(birthDate);

        if (matcher.matches()) {
            System.out.println("BirthDate : " + birthDate);
        } else {
            System.out.println("No matching pattern : " + birthDate);
        }
    }

    private static void checkRRN(String rrn) {

//        Pattern pattern = Pattern.compile("^\\dz{6}(1|2|3|4)\\d{6}$");
//        Pattern pattern = Pattern.compile("^\\d{6}[1-4]\\d{6}$");
        Pattern pattern = Pattern.compile("^(\\d{6})([1-4]\\d{6})$");
        Matcher matcher = pattern.matcher(rrn);

        if (matcher.find() && matcher.groupCount() == 2)
            System.out.println("RRN : " + matcher.group(1) + "-" + matcher.group(2));
        else
            System.out.println("No matching pattern : " + rrn);
    }
}
