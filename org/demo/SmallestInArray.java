package org.demo;

import java.util.Arrays;

public class SmallestInArray {

	public static void main(String[] args) {
		
		int a[]={7,1,2,5,6,3,2};
		int length =a.length;
		
		System.out.println("Smallest elemet: "+getSmallestElement(a,length));
		
	}
	
	public static int getSmallestElement(int a[],int n) {
		Arrays.sort(a);
		return a[0];
	}

}
