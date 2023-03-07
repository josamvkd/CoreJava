package com.example.corejava3;

public class M19
{
    public static void main(String[] args) {
        String s1 = "java is better than apple";
        int i = s1.lastIndexOf('a');
        System.out.println(i);
        int j =s1.lastIndexOf('a', i-1 );
        System.out.println(j);
        int k = s1.lastIndexOf('a',j-1);
        System.out.println(k);
    }
}
