package com.demo;

public class StackOverflowError {

	public static void main(String[] args) {
		System.out.println("Main Begin:");
		main(null);
		System.out.println("Main End:");

	}

}
