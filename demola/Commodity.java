package com.demola;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Commodity {
	int Id;
	String Name;
	Float Salary;
	
	public Commodity(int Id, String Name, Float Salary) {
		this.Id =Id;
		this.Name =Name;
		this.Salary =Salary;
	}

	public static void main(String[] args) {
		
		List<Commodity> plist = new ArrayList<>();
		plist.add(new Commodity(1001, "Kiran", 20000f));
		plist.add(new Commodity(2001,"Arun",25000f));
		plist.add(new Commodity(3002,"Nithin",30000f));
		plist.add(new Commodity(4005,"Kamal",90000f));
		plist.add(new Commodity(1006,"Ravi",28000f));
        

		
		  List<Float> resultList = plist.stream() 
				  .filter( p -> p.Salary > 30000) //filtering data 
	              .map(p ->p.Salary) // fetching price
		          .collect(Collectors.toList()); // collecting as list
		  System.out.println(resultList);
		 		
		/*
		 * plist.stream() .filter( p -> p.Salary > 30000) .forEach(p ->
		 * System.out.println(p.Salary));
		 */
		
	}
	

}
