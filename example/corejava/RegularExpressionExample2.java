package com.example.corejava;

import java.util.regex.Pattern;

public class RegularExpressionExample2 {
    public static void main(String[] args) {
        System.out.println("Mobile number valid ? "+Pattern.matches("[0-9]{10}", "0561111212"));
        System.out.println("Email valid ? "+Pattern.matches("\\b[a-zA-Z0-9._%]+@[a-zA-Z.-]+\\.[a-zA-Z]{2,4}\\b","jo@gmail.com"));
    }
}
