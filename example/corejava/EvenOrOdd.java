package com.example.corejava;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n=50;
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static class ArrayIndexOutOfBoundsExceptionHandling
    {
        public static void main(String[] args) {
            int [] arr =new int[2];
            try {
                arr[3] =10;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException ->"+e);
            }
            System.out.println("Rest of the code  !!");
        }
    }
}
