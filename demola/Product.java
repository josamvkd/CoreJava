package com.demola;
import java.util.ArrayList;
import java.util.List;

public class Product {
	int Id;
	String Name;
	Float Salary;
	
	public Product(int Id, String Name, Float Salary) {
		this.Id =Id;
		this.Name =Name;
		this.Salary =Salary;
	}

	public static void main(String[] args) {

		List<Product> plist = new ArrayList<>();
		plist.add(new Product(1001, "Kiran", 20000f));
		plist.add(new Product(2001,"Arun",25000f));
		plist.add(new Product(3002,"Nithin",30000f));
		plist.add(new Product(4005,"Kamal",90000f));
		plist.add(new Product(1006,"Ravi",28000f));
		
		List<Float> rlist= new ArrayList<Float>();
		for(Product p : plist) {
			 // filtering data of list  
			if(p.Salary < 30000) {
				rlist.add(p.Salary); // adding price to a productPriceList 
			}
		}
		System.out.println(rlist); // displaying data
	}

}
