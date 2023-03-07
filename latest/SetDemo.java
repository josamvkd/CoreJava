package com.latest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> value =new HashSet();
		//Set<Integer> value =new TreeSet<>();
		value.add(9);
		value.add(4);
		value.add(6);
		value.add(4);
		value.add(1);
		
		for(Integer i:value) {
			System.out.println(i);
		}
	}

}
