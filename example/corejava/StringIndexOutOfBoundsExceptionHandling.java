package com.example.corejava;

public class StringIndexOutOfBoundsExceptionHandling {
    public static void main(String[] args) {
        String str ="Dubai";
        try{
            System.out.println(str.charAt(5));
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("Exception -->"+ex);
        }
    }
}
