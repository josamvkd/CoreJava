package com.example.corejava3;

public class M15
{
    public static void main(String[] args)
    {
        String s1 = "java is better than apple";
        //           0123
        int i = s1.indexOf('a');
        System.out.println(i);//1
        int j = s1.indexOf('a', i + 1);
        System.out.println(j);//3
        int k = s1.indexOf('a', j + 1);
        System.out.println(k);//17
        int l = s1.indexOf('a', k + 1);
        System.out.println(l);//20
    }
}
