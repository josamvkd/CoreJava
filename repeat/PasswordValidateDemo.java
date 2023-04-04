package com.repeat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidateDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	    System.out.println("Please enter your password:");
	    String input = scan.nextLine();
		validate(input);
		scan.close();
	}
	private static final String regex1 ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+-=[{}]:;|.,~`/*+]).{8,20}$";
	private static final String regex2 ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+-=[{}]:;|.,~`/*+]).{6,}$";
	private static final Pattern pattern1 = Pattern.compile(regex1);
	private static final Pattern pattern2 = Pattern.compile(regex2);
	private static void validate(String password) {
		Matcher match1 = pattern1.matcher(password);
		Matcher match2 = pattern2.matcher(password);
		
		if(match1.matches()) {
			System.out.println("Strong");
		}else if(match2.matches()){
			System.out.println("Medium");
		}else {
			System.out.println("Weak");
		}
	}



}
