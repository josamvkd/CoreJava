package com.repeat;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailValidation {
	public static void validateEmail(String input) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches()==true) {
			System.out.println("Email Id: "+input+" is valid");
		}else {
			System.out.println("Email Id: "+input+" is Not valid");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Email:");
		String input =scan.nextLine();
		validateEmail(input);
		
		
		
	}

}
