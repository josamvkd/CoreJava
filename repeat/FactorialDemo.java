package com.repeat;

public class FactorialDemo {

	public static void main(String[] args) {
		int fact =1;
		int num =5;
		fact = factorial(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
	private static int factorial(int n) {
		if(n==0 || n==1) {
			return n;
		}else {
         	return (n*factorial(n-1));		
		}
	}

}
