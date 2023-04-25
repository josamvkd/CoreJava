package com.demola;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String arg[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name: ");
		String input = sc.nextLine();
		
		System.out.println("Name :"+input);
	}

}
