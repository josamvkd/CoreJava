package com.example.corejava;

public class ThrowExample {

    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not allowed for vote");
        }else{
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        validate(17);
        System.out.println("Continue rest of the code");
    }
}
