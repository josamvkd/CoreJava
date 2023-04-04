package com.repeat;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		list.add("abc");
		list.add("");
		list.add("");
		list.add("");
		list.add("xyz");
		list.add("abc");
		
		for(String i:list) {
			System.out.println(i);
		}
	}

}
