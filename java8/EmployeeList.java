package com.java8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("EMP001", "JOMON", 10000));
		employees.add(new Employee("EMP002", "BASIL", 5000));
		employees.add(new Employee("EMP003", "NIYAS", 6000));
		employees.add(new Employee("EMP004", "AYESHA", 3500));
		employees.add(new Employee("EMP005", "AJOMON", 4500));
		employees.add(new Employee("EMP006", "JOBY", 15000));
		employees.add(new Employee("EMP007", "FASIL", 4000));
		
		employees.stream().filter(i -> i.getSalary() >=7000).forEach(i -> System.out.println(i.getEmployeeName()));
		

	}

}
