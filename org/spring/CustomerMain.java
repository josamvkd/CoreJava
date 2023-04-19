package org.spring;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerMain {

	public static void main(String[] args) {
		
		List<Customer> customers = CustomerDataBase.getAll();
		
		//customer ->customer.getEmail()  one to one mapping
		List<String> emailId =customers.stream().map(customer ->customer.getEmail()).collect(Collectors.toList());
		System.out.println(emailId);
		System.out.println();
		
		// customer ->customer.getPhoneNumber() one to many mapping
		List<List<String>> phoneNumbers = customers.stream()
				.map(customer ->customer.getPhoneNumber())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
		System.out.println();
		List<String> phones = customers.stream()
				                       .flatMap(customer ->customer.getPhoneNumber().stream())
				                       .collect(Collectors.toList());		
		System.out.println(phones);
	}

}
