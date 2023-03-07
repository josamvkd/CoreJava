package com.example.corejava2;

public class StringIndexOfExample {
    public static void validate(String input){
        System.out.println(input.substring(0,input.indexOf("@")));
    }
    public static void main(String[] args) {
    String inputString ="josamvkd@gmail.com";
    validate(inputString);
    }
}
