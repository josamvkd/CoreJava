package com.repeat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValExample {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your email");
		String inputString =scan.nextLine();
		validateEmail(inputString);
	}
	
	private static void validateEmail(String input) {
		String regex  ="\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";

		Pattern patten =Pattern.compile(regex);
		Matcher matcher = patten.matcher(input);
		if(matcher.matches()==true) {
			System.out.println("Your email >> "+input+" >> Is valid");
		}else {
			System.out.println("Your email >> "+input+" >>Is not valid");
		}
	}

}
