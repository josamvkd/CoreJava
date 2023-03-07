package com.java8new;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("SAMUEL","ALEYAMMA","JOMON","JOBY");
		names.forEach(MethodReferenceDemo2::houseName);
	}
	
	public static void houseName(String s) {
		System.out.println(s+" Nellimootil");
	}

}
