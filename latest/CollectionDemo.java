package com.latest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {

		//Collection value =new ArrayList<>();
		List value =new ArrayList<>();
		value.add(1);
		value.add(21);
		value.add("Hello");
		value.add(1, 20); // 1 is position 20 is the value
		
		/*
		 * Iterator it =value.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		
		/*
		 * for(int i=0;i<value.size();i++) { System.out.println(value.get(i)); }
		 */
		
		for(Object o:value) {
			System.out.println(o);
		}
		
	}

}
