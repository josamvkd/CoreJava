package com.java8new;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		List<String> emirates=Arrays.asList("Abudhabi","Dubai","Sharjah","Ajman","Umm Al Quwain","Fujairah","Ras Al Khaimah");

		//emirates.forEach(i ->System.out.println(i));
		emirates.forEach(System.out::println);
	}

}
