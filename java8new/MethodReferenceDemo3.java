package com.java8new;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		
		List<Integer> values =Arrays.asList(4,6,8,10,12,14);
        values.forEach(MethodReferenceDemo3::divideIt);
	}
	
	public static void divideIt(int i) {
		System.out.println(i/2);
	}

}
