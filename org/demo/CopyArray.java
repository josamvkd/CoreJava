package org.demo;

public class CopyArray {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5}; 
		
		int [] arr1 = new int [arr.length];
		
		System.out.println("Original Array");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println();
		
		System.out.println("Duplicate Array");
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		

	}

}
