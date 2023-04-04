package com.repeat;

public class PalindromeDemo {

	public static void main(String[] args) {
		int rem,sum=0,temp;
		int n=123;
		temp =n;
		while(n>0) {
			rem =n%10;
			sum=(sum*10)+rem;
			n=n/10;
			System.out.println(n);
		}
		if(temp==sum) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}

	}

}
