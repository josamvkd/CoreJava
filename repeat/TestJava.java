package com.repeat;

import java.util.Scanner;

public class TestJava {
	public static void validate(String s) {
		if (s.contains("ClassCastException")) {
			System.out.println("ClassCastException |500|Low");
		} else if (s.contains("ArithmeticException")) {
			System.out.println("ArithmeticException|200|High");
		} else if (s.contains("|")) {
			System.out.println("SQLException | 100|Low | File not found");
		} else if (s.contains("SQLException")) {
			System.out.println("SQLException |300|Medium");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter:");
		String input = scan.nextLine();
		scan.close();
		validate(input);
	}
}
