package com.example.corejava;

public class StringValidation {
    public static void main(String[] args) {
        String inputString="abc@gmail.com";
        validate(inputString);
       /* System.out.println(s);

        String s1="bds#$";
        System.out.println(s1);

        String s2="HHI AIS";
        System.out.println(s2);

        String r3 ="1234$ABC";*/

    }

    public static void validate(String input){
      if( input.contains("@")){
          System.out.println("Its an Email Id");
      }else{
          System.out.println("Not an email id");
      }
    }
}
