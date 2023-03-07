package com.example.corejava2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
    public static void validate(String inputString){
        String regex ="\\b[0-9]{10}\\b";
        Pattern pat =Pattern.compile(regex);
        Matcher match =pat.matcher(inputString);
        if(match.matches()){
            System.out.println("Valid Number");
        }else{
            System.out.println("Invalid Number");
        }
    }
    public static void main(String[] args) {
        String num ="9048053902";
        validate(num);
    }
}
