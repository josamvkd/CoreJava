package com.example.ekfinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExample2 {

    public static void findFile() throws FileNotFoundException {
        FileReader file =new FileReader("C:/MyLog/abc.txt");
        BufferedReader output =new BufferedReader(file);
        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try{
            findFile();
        }catch(FileNotFoundException ex){
            System.out.println("Exception occurred"+ex);
        }
        System.out.println("Rest of the code !!");

    }
}
