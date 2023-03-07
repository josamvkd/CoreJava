package com.example.corejava;

public class NestedTryBlock2 {
    public static void main(String[] args) {
        try {
            try {
                int data=10/0;
                System.out.println("Try block 1");
            }catch (ArithmeticException e){
                System.out.println("Arithmetic Exception occurred-->"+e);
            }
            try{
                String s="Dubai";
                int du= Integer.parseInt(s);
                System.out.println("Try block 2");
            }catch(NumberFormatException e){
                System.out.println("NumberFormatException Exception occurred -->"+e);
            }
            try{
                int a[]=new int[2];
                a[1]=10;
                System.out.println("Try block 3");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException occurred -->"+e);
            }
            System.out.println("Inside Main try block !!!");
        } catch (Exception e) {
            System.out.println("Parent Catch!!!!!!"+e);
        }
        System.out.println("Rest of the code..!!!");
    }
}
