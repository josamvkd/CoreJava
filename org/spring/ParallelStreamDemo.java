package org.spring;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long start =0;
		long end =0;
		start= System.currentTimeMillis(); 
		IntStream.range(1, 100).forEach(System.out::println);
		end= System.currentTimeMillis(); 
		System.out.println("Pain Stream took "+(end-start)+" ms");
		System.out.println();
		
		start= System.currentTimeMillis(); 
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end= System.currentTimeMillis(); 
		System.out.println("Parallel Stream took "+(end-start)+" ms");
		
		System.out.println();
		
		IntStream.range(1, 10).forEach(i ->{
			System.out.println("Theread : "+Thread.currentThread().getName()+" : "+i);
		});
		
		System.out.println();
		
		IntStream.range(1, 10).parallel().forEach(i ->{
			System.out.println("Theread : "+Thread.currentThread().getName()+" : "+i);
		});
		
		
		List<Employee> employees =EmployeeDataBase.getEmployees();
		
		//Normal stream()
		start= System.currentTimeMillis(); 
		double salaryWithStream =employees.stream().map(Employee::getSalary).mapToDouble(i ->i).average().getAsDouble();
		end= System.currentTimeMillis(); 
		System.out.println("Pain Stream took "+(end-start)+" ms the Avg Salary is "+salaryWithStream);
		System.out.println();
		//Parallel stream()
		start= System.currentTimeMillis(); 
		double salaryWithParallelStream =employees.parallelStream().map(Employee::getSalary).mapToDouble(i ->i).average().getAsDouble();
		end= System.currentTimeMillis(); 
		System.out.println("Parallel Stream took "+(end-start)+" ms the Avg Salary is "+salaryWithParallelStream);
	}

}
