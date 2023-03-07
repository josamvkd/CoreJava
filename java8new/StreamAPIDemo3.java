package com.java8new;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo3 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		System.out.println(values.stream()
                .filter(i -> i%5==0)
				/* .map(i -> i*2) */
                .findFirst());
		
		List<Integer> val = Arrays.asList(6,4,6,4);
		
		System.out.println(val.stream()
                .filter(i -> i%5==0)
                .map(i -> i*2)
                .findFirst()
                .orElse(0));
	}

}
