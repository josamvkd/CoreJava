package com.latest;

import java.io.*;

//Compiler time  Exception
public class ThrowsDemo {

	public static void main(String[] args) throws Exception{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter : ");
		String input =br.readLine();
		System.out.println("Output is:"+input);
	}

}
