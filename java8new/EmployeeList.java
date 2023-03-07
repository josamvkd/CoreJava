package com.java8new;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("JOMON", "IDB007", 10000));
		empList.add(new Employee("JOBY", "IDB001", 11000));
		empList.add(new Employee("AJO", "IDB002", 5000));
		empList.add(new Employee("FASIL", "IDB003", 4000));
		empList.add(new Employee("HARI", "IDB005", 2500));
		empList.add(new Employee("SARATH", "IDB006", 5000));
		
		empList.stream().filter(i -> i.getSalary() > 7000).forEach(System.out::println);
		//empList.stream().filter(i -> i.getSalary() > 7000).forEach(i -> System.out.println(i.getName()));
	}

}
