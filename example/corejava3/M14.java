package com.example.corejava3;

public class M14
{
    public static void main(String[] args)
    {
        String s1 = "java";
        //           0123
        int i = s1.indexOf('v');
        System.out.println(i);//2
        int j = s1.indexOf('a');
        System.out.println(j);//1
        int k = s1.indexOf('a', j + 1);
        System.out.println(k);//3
    }
}
