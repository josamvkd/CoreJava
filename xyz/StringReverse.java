package com.xyz;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Emirates Airlines";
		
		StringBuilder sb = new StringBuilder(str);
		
		String str1 = sb.reverse().toString();
		System.out.println(str1);

	}

}
