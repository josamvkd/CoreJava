package com.example.corejava;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationNew {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Email Id : ");
        String input=scan.nextLine();

        String regex ="\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";

        Pattern pattern =Pattern.compile(regex);
        Matcher match =pattern.matcher(input);

        if(match.matches()==true){
            System.out.println(input+" --> Is Valid");
        }else{
            System.out.println(input+" --> Is not Valid");
        }
    }
}
