package org.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static Customer getEmailId(String email) throws Exception {
		List<Customer> customer = CustomerDataBase.getAll();
		return customer.stream()
				.filter(e ->e.getEmail().equalsIgnoreCase(email))
				.findAny()
				.orElseThrow(()-> new Exception("Email id is not present"));
		
	}

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer(505, "VISHNU", "vishnup@gmail.com", Arrays.asList("9856451236","7845126325"));
		
		//empty
		//of
		//ofNullable
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		System.out.println();
		
//		Optional<String> emailOptional = Optional.of(customer.getEmail());
//		System.out.println(emailOptional);
//		
//		System.out.println();
		
		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional2);
		
		System.out.println();
		
		Optional<String> emailOptional3 = Optional.ofNullable(customer.getEmail());
		if(emailOptional3.isPresent()) {
			System.out.println(emailOptional3.get());
		}
		
		System.out.println();
		
		Optional<String> emailOptional4 = Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional4.orElse("default@gmail.com"));
		//System.out.println(emailOptional4.orElseThrow(() ->new IllegalArgumentException("email cannot be null")));
		System.out.println(emailOptional4.map(String::toUpperCase).orElseGet(()->"default@gmail.com"));
		//getEmailId("josa@gmail.com");
		getEmailId("josamtechie@gmail.com");
	}

}
