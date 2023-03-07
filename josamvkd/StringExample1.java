package com.josamvkd;

public class StringExample1
{
    public static void main(String[] args) {
        String s1 ="jomon.samuel@gmail.com";

        System.out.println(s1.substring(0,(s1.indexOf("@"))));
        System.out.println(s1.substring(0,(s1.lastIndexOf("."))));
        System.out.println(s1.substring(0, (s1.indexOf("."))));
        System.out.println(s1.substring(s1.indexOf("g"), s1.lastIndexOf(".")));
        System.out.println(s1.substring(s1.indexOf("@"),s1.indexOf("g")));
    }
}
