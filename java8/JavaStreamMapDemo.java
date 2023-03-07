package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamMapDemo {

	public static void main(String[] args) {

	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1005, "Jomon");
	map.put(1008, "Anu");
	map.put(1001, "Joby");
	map.put(1004, "Amal");
	map.put(1002, "Jomon");
	map.put(1006, "Adam");
	map.put(1003, "Jubitha");
	
	//map.keySet().stream().forEach(i ->System.out.println(i));
	//map.values().stream().forEach(i->System.out.println(i));
	map.entrySet().stream().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
	}

}
