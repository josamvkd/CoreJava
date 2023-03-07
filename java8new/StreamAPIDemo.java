package com.java8new;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		List<Integer> values =Arrays.asList(5,2,4,3,9,1,7);
		
		values.stream().forEach(System.out::println);
	}

}
