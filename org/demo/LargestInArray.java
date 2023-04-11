package org.demo;

import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		int a[]={7,1,2,5,6,3,2};
		int length =a.length;
		System.out.println("Largest element: "+findLargestElement(a,length));
	}

	public static int findLargestElement(int a[], int n) {
		Arrays.sort(a);
		return a[n-1];
	}

}
