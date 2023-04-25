package com.demola;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("Name", "Jomon");
		map.put("Address", "Dubai");
		map.put("Car", "BMW");
		map.put("AAA", "BBB");
		
		Set<Entry<String,String>> itr =map.entrySet();
		for(Entry<String,String> i:itr ) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}

	}

}
