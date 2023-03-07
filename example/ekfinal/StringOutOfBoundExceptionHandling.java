package com.example.ekfinal;

public class StringOutOfBoundExceptionHandling
{
    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        try{
            arr[5] =10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException-->"+e);
        }
        System.out.println("Rest of the code!!!!!!");
    }
}
