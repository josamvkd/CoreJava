package com.josamvkd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String input =reader.readLine();
        System.out.println(input);
        String strArray[] = input.split(",");
        String s1 =strArray[0];
        String s2 = strArray[1];
        System.out.println(s1+"---"+s2);
    }
}
