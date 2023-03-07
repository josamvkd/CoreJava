package com.latest;

import java.util.Scanner;

public class UserInputDemo{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string :");
		String input =sc.nextLine();
		System.out.println("Input :"+input);	
		sc.close();
	}
}
