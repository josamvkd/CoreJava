package com.demola;
import java.io.*;

public class UserInputEx2 {

	public static void main(String[] args) throws Exception {

		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.println("Enter ");
		String input =br.readLine();
		System.out.println("Email : "+input);
		
		

	}

}
