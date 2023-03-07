package com.josamvkd;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation1
{
    public static void main(String[] args) {
        System.out.println("Enter you email id: ");
        Scanner scan =new Scanner(System.in);
        String input =scan.nextLine();

        String regex ="\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        if(match.matches()){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
    }
}
