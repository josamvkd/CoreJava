package com.josamvkd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation
{
    public static void main(String[] args) {
        String inputString ="jomon@gmail.com";
        validate(inputString);
    }

    public static void validate(String input){

        String regex ="\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher match =pattern.matcher(input);
        if(match.matches()){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
    }
}
