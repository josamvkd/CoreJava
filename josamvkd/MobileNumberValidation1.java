package com.josamvkd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation1
{
    public static void main(String[] args) {
        String input ="9048053902";
        String regex ="[0-9]{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        if(match.matches()){
            System.out.println("Valid mobile number");
        }else {
            System.out.println("Invalid mobile number");
        }
    }
}
