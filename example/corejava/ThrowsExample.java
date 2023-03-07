package com.example.corejava;

import java.io.IOException;

class Test{
    void validate() throws IOException {
        throw new IOException();
    }
}

public class ThrowsExample {
    public static void main(String[] args) {

        Test t =new Test();
        try {
            t.validate();
        } catch (IOException e) {
            System.out.println("Exception handled");
        }

    }
}
