package org.demo;

public class PalindromeDemo {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n= 123;
		
		temp=n;
		
		while(n>0) {
			r = n%10;
			sum= (sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}

	}

}
