package com.example.corejava;

public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        String s=null;
        try{
            System.out.println(s.length());
        }catch(Exception e){
            System.out.println("Null Pointer Exception Occurred  --->"+e);
        }
        System.out.println("Rest of the code....");
    }


}
