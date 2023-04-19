package org.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class mapReduceExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5,2,4,3,6,9,8,7);
		
		int sum =0;
		
		for(Integer i :numbers) {
			sum =sum+i;
		}
		System.out.println(sum);
		
		System.out.println();
		
		int sum1 = numbers.stream().mapToInt(i ->i).sum();
		System.out.println(sum1);
		
		System.out.println();
		
		Integer sum3 = numbers.stream().reduce(0,(a,b) ->a+b);
	    System.out.println(sum3); 
	    
	    System.out.println();
	    
	    Optional<Integer> sum4 =numbers.stream().reduce(Integer::sum);
	    System.out.println(sum4.get());
	    
	    System.out.println();
	    
	    Integer maxValue = numbers.stream().reduce(0,(a,b) -> a>b?a:b);
	    System.out.println(maxValue);
	    
	    System.out.println();
	    Integer maxValue1 = numbers.stream().reduce(Integer::max).get();
	    System.out.println(maxValue1);
	    
	}

}
