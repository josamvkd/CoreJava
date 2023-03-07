package com.java8;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamApiDemo {
	
	int id;
	String name;
	float salary; 
	
	public StreamApiDemo (int id, String name, float salary) {
		this.id =id ;
		this.name = name;
		this.salary =salary;
	}

	public static void main(String[] args) {

		List<StreamApiDemo> inputList = new ArrayList<StreamApiDemo>();
		inputList.add(new StreamApiDemo(101, "John", 21000f));
		inputList.add(new StreamApiDemo(102, "David", 25000f));
		inputList.add(new StreamApiDemo(103, "Vishnu", 31000f));
		inputList.add(new StreamApiDemo(104, "James", 41000f));
		inputList.add(new StreamApiDemo(105, "Joseph", 23000f));
		inputList.add(new StreamApiDemo(106, "Anil", 11000f));
		
		
		List<Float> outputList=inputList.stream()
				                        .filter(p->p.salary <30000)
				                        .map(p -> p.salary)
				                        .collect(Collectors.toList());
		
		System.out.println(outputList);
	}

}
