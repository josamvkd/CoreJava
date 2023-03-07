package com.demo;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "CAR");
		map.put(2, "JEEP");
		map.put(3, "BIKE");
		map.put(4, "TRAIN");
		map.put(8, "FLIGHT");
		map.put(5, "AUTO");
		map.put(7, "LORRY");

		map.forEach((k,v) -> System.out.println(k+"  "+v));
	}

}
