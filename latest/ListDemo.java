package com.latest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> value =new ArrayList<>();
		value.add(1);
		value.add(9);
		value.add(6);
		value.add(4);
		
		Collections.sort(value);
		Collections.reverse(value);
		
		for(Integer i:value) {
			System.out.println(i);
		}
	}

}
