package com.example.ekfinal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation
{
    private static void validateMobile(String input){
        String regex ="[0-9]{10}";
        Pattern pattern  = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        if(match.matches()){
            System.out.println("Valid Mobile Number");
        }else{
            System.out.println("Invalid mobile Number!!!");
        }

    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String mobNumber =scan.nextLine();
        validateMobile(mobNumber);
    }
}
