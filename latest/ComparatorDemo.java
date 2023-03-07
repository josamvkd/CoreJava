package com.latest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> value =new ArrayList<>();
		value.add(109);
		value.add(943);
		value.add(687);
		value.add(452);
		value.add(291);
		value.add(310);
		
		//Collections.sort(value);
		/*
		 * Comparator<Integer> com =new Comparator<Integer>() {
		 * 
		 * public int compare(Integer i,Integer j) {
		 * 
		 * if (i % 10 > j % 10) { return 1; } return -1; } };
		 */
		
		//Comparator<Integer> com = (i,j) ->i%10>j%10?1:-1;
		
		Collections.sort(value, (i,j) ->i%10>j%10?1:-1);
		
		for(Integer i:value) {
			System.out.println(i);
		}
	}

}
