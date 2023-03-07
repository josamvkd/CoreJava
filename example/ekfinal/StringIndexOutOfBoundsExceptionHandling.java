package com.example.ekfinal;

public class StringIndexOutOfBoundsExceptionHandling
{
    public static void main(String[] args) {
        String s1 ="Hello";
        try{
            System.out.println(s1.charAt(6));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException ->"+e);
        }
        System.out.println("Rest of the code!!");
    }
}
