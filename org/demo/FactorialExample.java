package org.demo;

public class FactorialExample {

	public static void main(String[] args) {
		int fact=1;
		int num =6;
		fact = factorial(num);
		System.out.println("Factorial of "+num+" is : "+fact);
	}

	private static int factorial(int n) {
		if(n==0) {
		 return 1;
		}
		return (n * factorial(n-1));
	}

	

}
