package com.example.corejava3;

public class M3
{
    public static void main(String[] args) {
        String s1="hello";
        //         01234
        char c1 = s1.charAt(5); // Exception - String index out of range: 5
        System.out.println(c1);
        System.out.println(s1);
    }
}
