package com.java8new;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> values =Arrays.asList(2,5,1,3,8,6,7,9);

		/*
		 * for(int i:values) { System.out.println(i); }
		 */
		
		/*
		 * for(int i=0;i<values.size();i++) { System.out.println(values.get(i)); }
		 */
		
		values.forEach(i->System.out.println(i));
	}

}
