package com.example.corejava;

public class ThrowDemo1 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not Eligible for Vote");
        }else{
            System.out.println("Eligible for Vote");
        }
    }
    public static void main(String[] args) {
    validate(10);
    System.out.println("Rest of the code");

    }
}
