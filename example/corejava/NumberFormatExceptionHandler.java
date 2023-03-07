package com.example.corejava;

public class NumberFormatExceptionHandler {
    public static void main(String[] args) {
        String s="Emirates";
        try {
            int i =Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred--->"+e);
        }
        System.out.println("Rest of the code....");
    }
}
