package com.example.corejava3;

public class M28
{
    public static void main(String[] args)
    {
        String s1 = "abc xyz";
        //           0123456
        int i = s1.indexOf(' ');
        String s2 = s1.substring(0, i);
        String s3 = s1.substring(i + 1);
        System.out.println(s1);//abc xyz
        System.out.println(s2);//abc
        System.out.println(s3);//xyz
    }
}
