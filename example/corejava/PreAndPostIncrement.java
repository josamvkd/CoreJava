package com.example.corejava;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        int m=4;
        int n=5;

        //m = ++n;//first increment the value of 'n' then assign --Pre Increment
        m = n++;// first assign the value then increase the value of n --Post Increment
        System.out.println(m);
        System.out.println(n);
    }
}
