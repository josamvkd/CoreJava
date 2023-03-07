package com.demo;

public class OutOfMemoryError {

	public static void main(String[] args) {
		System.out.println("Main Begin:");
		int[] elements =new int[999999999];
		System.out.println("Main End:");

	}

}
