package com.demo;

public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		System.out.println("Main Begin:");
		String s1 = "welcome";
		//           0123456
		String s2 =s1.substring(2,10);
		
		System.out.println("Main End:");
	}

}
