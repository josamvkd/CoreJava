package com.repeat;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("abc");
		set.add("");
		set.add("");
		set.add("");
		set.add("xyz");
		set.add("abc");
		
		for(String s:set) {
			System.out.println(s);
		}

	}

}
