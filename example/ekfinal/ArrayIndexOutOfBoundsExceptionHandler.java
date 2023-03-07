package com.example.ekfinal;

public class ArrayIndexOutOfBoundsExceptionHandler {
    public static void main(String[] args) {
        int a[]=new int[5];
        try {
            a[10]=10;
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred --->"+e);
        }
        System.out.println("Rest of the code....");
    }
}
