package com.example.corejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowDemo2 {
    public static void demo() throws FileNotFoundException {
        FileReader file =new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fileInput =new BufferedReader(file);
        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
    try {
        demo();
    }catch(Exception e){
        System.out.println("Exception Occurred");
        e.printStackTrace();
    }
        System.out.println("Rest of the code");
    }
}
