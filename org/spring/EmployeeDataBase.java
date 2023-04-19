package org.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDataBase {
	
	public static List<Employee> getEmployees(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		for(int i=1;i<=1000;i++) {
			employees.add(new Employee(i, "Employee"+i, "A", Double.valueOf(new Random().nextInt(1000*100))));
		}
		return employees;
	}

}
