package com.josamvkd;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation
{
    public static void numberValidate(String inputString){
        String regex ="[0-9]{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(inputString);
        if(match.matches()){
            System.out.println("Valid Mobile Number");
        }else{
            System.out.println("Invalid Mobile Number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your Mobile Number:");
        Scanner scan =new Scanner(System.in);
        String input=scan.nextLine();
        numberValidate(input);
    }
}
