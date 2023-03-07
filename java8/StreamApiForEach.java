package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiForEach {
	int id;
	String name;
	float salary; 
	
	public StreamApiForEach (int id, String name, float salary) {
		this.id =id ;
		this.name = name;
		this.salary =salary;
	}

	public static void main(String[] args) {

		List<StreamApiForEach> inputList = new ArrayList<StreamApiForEach>();
		inputList.add(new StreamApiForEach(101, "John", 21000f));
		inputList.add(new StreamApiForEach(102, "David", 25000f));
		inputList.add(new StreamApiForEach(103, "Vishnu", 31000f));
		inputList.add(new StreamApiForEach(104, "James", 41000f));
		inputList.add(new StreamApiForEach(105, "Joseph", 23000f));
		inputList.add(new StreamApiForEach(106, "Anil", 11000f));
		
		
		//inputList.stream().filter(p->p.salary <30000).forEach(p-> System.out.println(p.salary));
		inputList.stream().filter(p->p.salary <30000).forEach(p-> System.out.println(p.name));
		
		//System.out.println(outputList);
	}


}
