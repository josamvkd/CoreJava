package com.example.corejava;

public class ArithmeticExceptionHandling {

    public static void main(String[] args) {
//        int i ,j , k;
//        i= 50;
//        j= 0;
        try{
//            k= i/j;
            int data =100/0;
        }catch (Exception e){
            System.out.println("Arithmetic Exception occurred-->"+e);
        }
        System.out.println("Rest of the code....");
    }
}
