package com.latest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map =new HashMap<>();
		//Map<String, String> map =new Hashtable<>();
		map.put("One", "Jomon");
		map.put("Four", "Joby");
		map.put("Six", "Anu");
		map.put("Two", "Amal");
		
		//System.out.println(map.get("Two"));
		
		Set<String> keys =map.keySet();
 		
		for (String key : keys) {
			System.out.println(key + "   " + map.get(key));
		}
		
	}

}
