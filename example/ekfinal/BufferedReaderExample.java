package com.example.ekfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample
{
    public static void main(String[] args) throws IOException {
        BufferedReader input =new BufferedReader( new InputStreamReader(System.in));
        String s1 =input.readLine();

        System.out.println(s1);

        String strArray[] =s1.split(",");
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);

    }
}
