package com.example.ekfinal;

import java.util.Scanner;

public class ThrowExample
{
    public static void main(String[] args) {
        System.out.print("Please enter your Age : ");
        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();
        ageValidator(input);
        System.out.println("Rest of the code");
    }
    public static void ageValidator(Integer input){
        if(input < 18){
            throw new ArithmeticException("You are not eligible Age seems less than 18 ");
        }else{
            System.out.println("You are eligible");
        }
    }
}
