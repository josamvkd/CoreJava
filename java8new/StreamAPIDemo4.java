package com.java8new;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo4 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		System.out.println(values.stream()
                .filter(StreamAPIDemo4::isDivisible)
				.map(StreamAPIDemo4::mapDoubleIt) 
                .findFirst()
                .orElse(0));

	}
	
	public static boolean isDivisible(int i) {
		return i%5==0;
	}
	public static int mapDoubleIt(int i) {
		return i*2;
	}
	

}
