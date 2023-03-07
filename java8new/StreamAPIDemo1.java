package com.java8new;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo1 {

	public static void main(String[] args) {
		
		List<Integer> values =Arrays.asList(1,2,3,4,5,6,7);

		//System.out.println(values.stream().map(i ->i*2).reduce(0,(i,j)->i+j));
		
		
		//System.out.println(values.stream().map(i->i+1).reduce(0,(m,n) ->m+n));
		
		//System.out.println(values.stream().map(i -> i*2).reduce(0,(i,j) -> Integer.sum(i, j)));
		System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));
	}

}
