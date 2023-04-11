package org.demo;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int a[]={1,4,5,6,3,2,7};
		int length =a.length;
		System.out.println("Second Largest Element is: "+findSecondLargest(a,length));
	}

	public static int findSecondLargest(int a[], int n) {
		Arrays.sort(a);
		return a[n-2];
	}
}
