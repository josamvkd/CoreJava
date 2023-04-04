package com.repeat;

import java.util.HashMap;
import java.util.Map;

public class SubStringDemo {

	public static void main(String[] args) {
		
		/*
		 * String abc ="WindowsAndLinuxKeyMap"; //012345678901234567890
		 * 
		 * String s1 =abc.substring(0,7); System.out.println(s1);
		 */
		
		Map<String, String> map = new HashMap<String, String>();
		
		if(map.get("myKey")==null) {
			map.put("myKey","Helllllo");
			System.out.println(map.get("myKey")+" >>> Key set successfully");
		}else {
			System.out.println(map.get("myKey")+" >>> get key" );
		}
		
		
		
	}

}
