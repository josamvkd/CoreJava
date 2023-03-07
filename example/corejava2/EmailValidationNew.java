package com.example.corejava2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationNew {
    public static void validate(String inputString){
        String regex ="\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";
        Pattern pa =Pattern.compile(regex);
        Matcher match =pa.matcher(inputString);
        if(match.matches()){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email ");
        }
    }
    public static void main(String[] args) {
        String input="jomon.samuel@gmail.com";
        validate(input);
    }
}
