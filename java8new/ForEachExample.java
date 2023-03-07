package com.java8new;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(2);
		values.add(5);
		values.add(3);
		values.add(1);
		values.add(7);
		values.add(9);
		values.add(6);
		values.add(8);
		/*
		 * Method 1
		 */
		/*
		 * for(int i=0;i<values.size();i++) {
		 * System.out.println("Array contains : "+values.get(i)); }
		 */
		
		/*
		 * Method 2
		 */
		
		/*for(int i:values) {
			System.out.println("Values : "+i);
		}*/
		
		/*
		 * Method 3
		 */
		
		values.forEach(i -> System.out.println("Array contains : "+i));
	}

}
