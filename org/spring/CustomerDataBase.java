package org.spring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {
	
	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101, "JOSAM TECHIE", "josamtechie@gmail.com", Arrays.asList("9044052145","142445214")),
				new Customer(155, "SHAKEEL", "shakeel@gmail.com", Arrays.asList("855052145","656545214")),
				new Customer(155, "JOHN", "john@gmail.com", Arrays.asList("787452145","989845214")),
				new Customer(155, "PETER", "peter@gmail.com", Arrays.asList("365252145","565645214"))
				).collect(Collectors.toList());
	}

}
