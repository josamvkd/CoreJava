package com.java8new;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {

	public static void main(String args[]) {
	
	ArrayList<Product> productsList = new ArrayList<>();
	productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",29000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));
    
	
	
	  List<Float> productsList2 = productsList.stream().filter(i -> i.getPrice() >25000) // filtering data 
			  .map(i ->i.getPrice()) // fetching price
	          .collect(Collectors.toList()); // collecting as list
	  
	  System.out.println(productsList2);
	 
    
    // Converting product List into Set  
    
	/*
	 * Set<Float> prodSet = productsList.stream() .filter(i -> i.getPrice() < 30000)
	 * .map(i ->i.getPrice()) .collect(Collectors.toSet());
	 * System.out.println(prodSet);
	 */
    
    // Filtering and Iterating Collection
    
	/*
	 * productsList.stream() .filter(i -> i.getPrice() == 30000) .forEach(i ->
	 * System.out.println(i.getName()));
	 */
    
    //reduce() Method in Collection
    
	/*
	 * Float totalPrice = productsList.stream() .map(i -> i.getPrice())
	 * .reduce(0.0f, (i,j) ->i+j);
	 */
	/*
	 * Float totalPrice = productsList.stream() .map(i -> i.getPrice())
	 * .reduce(0.0f, Float::sum);
	 * System.out.println("Total Price is : "+totalPrice);
	 */
    
    // Sum by using Collectors Methods
    
	/*
	 * double totalPrice2 = productsList.stream()
	 * .collect(Collectors.summingDouble(i -> i.getPrice()));
	 * System.out.println(totalPrice2);
	 */
    
    // max() method to get max Product price   
    
	/*
	 * Product productA = productsList.stream() .max((p1,p2) -> p1.getPrice() <
	 * p2.getPrice() ? 1: -1).get(); System.out.println(productA.getPrice());
	 */
	
	// min() method to get min Product price  
	
	/*
	 * Product productB = productsList.stream().min((p1, p2) -> p1.getPrice() <
	 * p2.getPrice() ? 1 : -1).get(); System.out.println(productB.getPrice());
	 */
    
    //count() Method in Collection
    
	/*
	 * long count = productsList.stream() .filter(i -> i.getPrice() <30000)
	 * .count(); System.out.println(count);
	 */
	}
}
