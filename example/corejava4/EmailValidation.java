package com.example.corejava4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter email id:");
        String input =scan.nextLine();

        String regex = "\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";
        Pattern patten =Pattern.compile(regex);
        Matcher match =patten.matcher(input);
        if(match.matches()){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
    }
}
