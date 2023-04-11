package org.demo;

import java.util.Arrays;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		 int arr[] = {10,90,70,30,90,20,20,30,40,70,50};
		 
		 Arrays.sort(arr);
		 
		 int length = arr.length;
		 
		 length = findDuplicateElements(arr,length);
		 
		 for(int i=0;i<length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
	}
	
	public static int findDuplicateElements(int[] arr, int n) {
		
		if(n==0||n==1) {
			return n;
		}else {
			int j=0;
			for(int i=0;i<n-1;i++) {
				if(arr[i] != arr[i+1]) {
					arr[j++] = arr[i];
				}
			}
			arr[j++] =arr[n-1];
			return j;
		}	
		
	}
	

	/*
	 * private static int findDuplicateElements(int[] arr, int n) { if(n==0 ||n==1)
	 * { return n; } int j =0; for(int i=0;i<n-1;i++) { if(arr[i] !=arr[i+1]) {
	 * arr[j++]=arr[i]; } } arr[j++] = arr[n-1];
	 * 
	 * return j; }
	 */

}
