package org.demo;

import java.util.Arrays;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		int a[]={1,4,5,6,3,2};
		int length =a.length;
		System.out.println("Second Smallest Number is: "+findSecondSmallest(a,length));
	}
	
	public static int findSecondSmallest(int a[], int n) {
		Arrays.sort(a);
		return a[1];
	}

}
