package com.example.ekfinal;

import java.util.Scanner;

public class StringExample1
{
    public static void main(String[] args) {
        System.out.print("Please enter Email Id: ");
        Scanner scan =new Scanner(System.in);
        String input =scan.nextLine();
        System.out.println(input);
        String s1 = input.substring(0,input.indexOf("@"));
        System.out.println("User Name is : "+s1);



    }
}
