package com.example.ekfinal;

public class ArithmeticExceptionHandling
{
    public static void main(String[] args) {

        try{
        int data = 100/0;
        }catch(ArithmeticException ex){
            System.out.println("Arithmetic Exception ->"+ex);
        }

        System.out.println("Rest of the code");

    }
}
