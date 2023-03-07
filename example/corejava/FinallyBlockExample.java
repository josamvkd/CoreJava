package com.example.corejava;

public class FinallyBlockExample {
    public static void main(String[] args) {

        try {
            int data=50/0;
            System.out.println("Inside Try block !!!");
        } catch (Exception e) {
            System.out.println("Inside Catch Block !!!");
        } finally {
            System.out.println("Inside finally block  !!!");
        }
        System.out.println("Rest of the code !!!");
    }
}
