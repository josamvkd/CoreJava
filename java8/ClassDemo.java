package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassDemo {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,2,2,2,4,5,6,7);
		
		List<Integer> listWithoutDuplicates = list.stream()
	            .distinct()
	            .collect(Collectors.toList());
		System.out.println(listWithoutDuplicates);

	}

}
