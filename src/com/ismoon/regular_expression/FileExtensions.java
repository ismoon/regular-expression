package com.ismoon.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ismoon on 2018. 1. 14.
 */
public class FileExtensions {
    public static void main(String[] args) {
        checkFileExtension("insu.jpg");
        checkFileExtension("INSU.JPG");
        checkFileExtension("ㅏㅏㅏ.png");
        checkFileExtension("KKK.PNG");
        checkFileExtension("apckee.txt");
    }

    private static void checkFileExtension(String extension) {
        Pattern pattern = Pattern.compile("^\\S+.(?i)(png|jpg|bmp|gif)$");
        Matcher matcher = pattern.matcher(extension);

        if (matcher.matches()) {
            System.out.println("File Extension : " + extension);
        } else {
            System.out.println("No Matching Pattern : " + extension);
        }
    }
}
