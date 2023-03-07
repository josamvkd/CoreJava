package com.example.ekfinal;

class NullPointerExceptionHandling
{
    public static void main(String[] args) {
        String s= null;
        try{
            int i = s.length();
            System.out.println(i);
        }catch(NullPointerException e){
            System.out.println("NullPointerException Occurred-->"+e);
        }
        System.out.println("Rest of the code!!!");
    }
}
