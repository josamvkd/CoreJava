package com.example.corejava;

import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static void main(String[] args) {
        System.out.println("Mobile Valid ?"+Pattern.matches("[0-9]{10}","9048053902"));
        System.out.println(Pattern.matches("[a-z0-9]{5}","abn12"));
        System.out.println("First Email Id valid ? "+Pattern.matches("\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b","Jomon.samuel@dnata.com"));
        System.out.println("Second Email Id valid ? "+Pattern.matches("\\b[a-zA-Z0-9._%]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b","jomon.samuel@dnata"));
    }
}
