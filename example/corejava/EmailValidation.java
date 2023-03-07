package com.example.corejava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your Email Id:");
        String input=scan.nextLine();
        String regex ="\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher =pattern.matcher(input);
        if(matcher.matches()==true){
            System.out.println("Email Id is valid");
        }else{
            System.out.println("Email Id is Not Valid");
        }

    }
}
