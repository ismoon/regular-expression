package com.ismoon.regular_expression;

import com.ismoon.regular_expression.checker.RegexpChecker;

/**
 * @author ismoon on 2018. 1. 15.
 */
public class Application {
    public static void main(String[] args) {
        RegexpChecker regexpChecker = new RegexpChecker();

        //UserName 체크 정규식 (영문자, 숫자, 언더스코어( _ ), 하이픈( - ) 3 ~ 6 자리)
        System.out.println("==============================================");
        System.out.println("UserName RegexpChecker : ^[a-z0-9_-]{3,16}$\n");
        regexpChecker.setRegexp("^[a-z0-9_-]{3,16}$");
        regexpChecker.checkRegexp("ismoon");
        regexpChecker.checkRegexp("무닌수");
        regexpChecker.checkRegexp("mjis-4341-jjjessc-dkekfkdkk");
        System.out.println("==============================================\n");

        //Password 체크 정규식 문자, 숫자, 특수문자 포함 8 ~ 16자리
        System.out.println("==============================================");
        System.out.println("Password RegexpChecker : ^[a-zA-Z0-9~!@#$%^&*()]{8,16}\n");
        regexpChecker.setRegexp("^[a-zA-Z0-9~!@#$%^&*()]{8,16}");
        regexpChecker.checkRegexp("dfexxf@#$%%^_");
        regexpChecker.checkRegexp("mp3sjanwhgdk@$");
        System.out.println("==============================================\n");

        //Email 체크 정규식
        System.out.println("==============================================");
        System.out.println("Email RegexpChecker : ^[a-z0-9A-Z_-]*@[a-z0-9A-Z]*.[a-zA-Z.]*$\n");
        regexpChecker.setRegexp("^[a-z0-9A-Z_-]*@[a-z0-9A-Z]*.[a-zA-Z.]*$");
        regexpChecker.checkRegexp("mjis4341@naver.com");
        regexpChecker.checkRegexp("mjis4341@naver.@com");
        regexpChecker.checkRegexp("%%%%_aiss@naver.com");
        System.out.println("==============================================\n");

        //FileExtensions 체크 정규식
        System.out.println("==============================================");
        System.out.println("FileExtensions RegexpChecker : ^\\S+.(?i)(png|jpg|bmp|gif)$\n");
        regexpChecker.setRegexp("^\\S+.(?i)(png|jpg|bmp|gif)$");
        regexpChecker.checkRegexp("insu.jpg");
        regexpChecker.checkRegexp("INSU.JPG");
        regexpChecker.checkRegexp("ㅏㅏㅏ.png");
        regexpChecker.checkRegexp("apckee.txt");
        System.out.println("==============================================\n");

        //HexValue 체크 정규식
        System.out.println("==============================================");
        System.out.println("HexValue RegexpChecker : ^#?([a-f0-9]{6}|[a-f0-9]{3})$\n");
        regexpChecker.setRegexp("^#?([a-f0-9]{6}|[a-f0-9]{3})$");
        regexpChecker.checkRegexp("#aaaaaa");
        regexpChecker.checkRegexp("aaaaaa");
        regexpChecker.checkRegexp("#ffff");
        regexpChecker.checkRegexp("#1aadkk");
        System.out.println("==============================================\n");

        //IP Number 체크 정규식
        System.out.println("==============================================");
        System.out.println("IP Number RegexpChecker : ^\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}$\n");
        regexpChecker.setRegexp("^\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}$");
        //regexpChecker.setRegexp("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        regexpChecker.checkRegexp("192.182.0.12");
        regexpChecker.checkRegexp("1922.182.0.12");
        regexpChecker.checkRegexp("10.182.0.12");
        regexpChecker.checkRegexp("1.182.0.12");
        System.out.println("==============================================\n");

        //Slug 체크 정규식
        System.out.println("==============================================");
        System.out.println("Slug RegexpChecker : ^[a-z0-9-]+$\n");
        regexpChecker.setRegexp("^[a-z0-9-]+$");
        regexpChecker.checkRegexp("my-title-here");
        regexpChecker.checkRegexp("my_title_here");
        System.out.println("==============================================\n");

        //URL 체크 정규식
        System.out.println("==============================================");
        System.out.println("URL RegexpChecker : ^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w_\\.-]*)*\\/?$\n");
        regexpChecker.setRegexp("^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w_\\.-]*)*\\/?$");
        regexpChecker.checkRegexp("https://www.naver.com/");
        regexpChecker.checkRegexp("http://www.naver.com");
        regexpChecker.checkRegexp("www.naver.com/");
        regexpChecker.checkRegexp("http://google.com/some/file!.html");
        regexpChecker.checkRegexp("https://blog.outsider.ne.kr/360");
        System.out.println("==============================================\n");

        //Phone Number 체크 정규식
        System.out.println("==============================================");
        System.out.println("Phone Number RegexpChecker : (01[016789])(\\d{3,4})(\\d{4})\n");
        regexpChecker.setRegexp("(01[016789])(\\d{3,4})(\\d{4})");
        regexpChecker.checkRegexp("01041794341");
        regexpChecker.checkRegexp("010417294341");
        regexpChecker.checkRegexp("0114941341");
        regexpChecker.checkRegexp("01241794341");
        System.out.println("==============================================\n");

        //Resident Registration Number 체크 정규식
        System.out.println("==============================================");
        System.out.println("RRN RegexpChecker : ^(\\d{6})([1-4]\\d{6})$\n");
        regexpChecker.setRegexp("^(\\d{6})([1-4]\\d{6})$");
        //regexpChecker.setRegexp("^\\dz{6}(1|2|3|4)\\d{6}$");
        //regexpChecker.setRegexp("^\\d{6}[1-4]\\d{6}$");
        regexpChecker.checkRegexp("8905251111111");
        regexpChecker.checkRegexp("8905255555555");
        regexpChecker.checkRegexp("89052545678901");
        regexpChecker.checkRegexp("890525111778");
        System.out.println("==============================================\n");

        // HTML Tag 체크 정규식
        System.out.println("==============================================");
        System.out.println("HTML Tag RegexpChecker : ^<([a-z]+)([^<]+)*(?:>(.*)<\\/\\1>|\\s+\\/>)$\n");
        regexpChecker.setRegexp("^<([a-z]+)([^<]+)*(?:>(.*)<\\/\\1>|\\s+\\/>)$");
        regexpChecker.checkRegexp("<a href=\"http://net.tutsplus.com/\"> Nettuts+</a>");
        regexpChecker.checkRegexp("<img src=\"img.jpg\" alt=\"My image>\" />");
        System.out.println("==============================================\n");
    }
}
