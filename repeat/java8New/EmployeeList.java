package com.repeat.java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> employeeList =new ArrayList<>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//		System.out.println("-----------------------START------------------------------------------------------------------");
//		System.out.println("1. How many male and female employees are there in the organization?");
//		System.out.println("====================================================================");
//		Map<String,Long> howManyMaleAndFemale =
//				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String,Long>> entrySet= howManyMaleAndFemale.entrySet();
//		for(Entry<String,Long> entry:entrySet) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}

//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("2. Print the name of all departments in the organization?");
//		System.out.println("=========================================================");
//		employeeList.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("3. What is the average age of male and female employees?");
//		System.out.println("========================================================");
//        Map<String, Double> avgAge=
//        		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
//        Set<Entry<String,Double>> entrySet1=avgAge.entrySet();
//        for(Entry<String,Double> entry :entrySet1) {
//        	System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("4. Get the details of highest paid employee in the organization?");
//		System.out.println("================================================================");
//		Optional<Employee> highestSalWrap=
//				employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
//		Employee highestSal =highestSalWrap.get();
//		System.out.println(highestSal.getName());
//		System.out.println(highestSal.getDepartment());
//		System.out.println(highestSal.getSalary());
//		System.out.println(highestSal.getYearOfJoining());
//		System.out.println(highestSal.getGender());
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("5. Get the names of all employees who have joined after 2015?");
//		System.out.println("=============================================================");
//		//employeeList.stream().filter(e->e.getYearOfJoining() >2015).forEach(e->System.out.println(e.getName()));
//		//employeeList.stream().filter(e->e.getYearOfJoining() >2015).map(e->e.getName()).forEach(System.out::println);
//		employeeList.stream().filter(e->e.getYearOfJoining() >2015).map(Employee::getName).forEach(System.out::println);
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("6. Count the number of employees in each department?");
//		System.out.println("====================================================");
//        Map<String, Long> noOfEmployee=
//        		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        Set<Entry<String,Long>> entrySet2=noOfEmployee.entrySet();
//        for(Entry<String,Long> entry:entrySet2) {
//        	System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("7. What is the average salary of each department?");
//		System.out.println("=================================================");
//		Map<String, Double> avgSalaryOfEachDept =
//				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        Set<Entry<String, Double>> entrySet3 =avgSalaryOfEachDept.entrySet();
//        for(Entry<String, Double> entry:entrySet3) {
//        	System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("8. Get the details of youngest male employee in the product development department?");
//		System.out.println("===================================================================================");
//        Optional<Employee> yougestEmployeeWrap =
//        		employeeList.stream().filter(e->e.getDepartment()=="Product Development" && e.getGender()=="Male").min(Comparator.comparing(Employee::getAge));
//        Employee yougestEmployee =yougestEmployeeWrap.get();
//        System.out.println("Employee Id: "+yougestEmployee.getId());
//        System.out.println("Employee Name: "+yougestEmployee.getName());
//        System.out.println("Employee Age: "+yougestEmployee.getAge());
//        System.out.println("Employee Dpt: "+yougestEmployee.getDepartment());
//        System.out.println("Employee Gender: "+yougestEmployee.getGender());
//        System.out.println("Employee Salary: "+yougestEmployee.getSalary());
//        System.out.println("Employee YOJ: "+yougestEmployee.getYearOfJoining());
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("9. Who has the most working experience in the organization?");
//		System.out.println("===========================================================");
//		Optional<Employee> MostExperiencedEmployeeWrap =
//				employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
//      Employee MostExperiencedEmployee =MostExperiencedEmployeeWrap.get();
//      System.out.println("Employee Id: "+MostExperiencedEmployee.getId());
//      System.out.println("Employee Name: "+MostExperiencedEmployee.getName());
//      System.out.println("Employee Age: "+MostExperiencedEmployee.getAge());
//      System.out.println("Employee Dpt: "+MostExperiencedEmployee.getDepartment());
//      System.out.println("Employee Gender: "+MostExperiencedEmployee.getGender());
//      System.out.println("Employee Salary: "+MostExperiencedEmployee.getSalary());
//      System.out.println("Employee YOJ: "+MostExperiencedEmployee.getYearOfJoining());		
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("10. How many male and female employees are there in the sales and marketing team?");
//		System.out.println("=================================================================================");
//		Map<String, Long> howManyMaleAndFemale =
//				employeeList.stream()
//				            .filter(e ->e.getDepartment()=="Sales And Marketing")
//				            .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		Set<Entry<String, Long>> entrySet4 = howManyMaleAndFemale.entrySet();
//		for(Entry<String, Long> entry : entrySet4) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("11. What is the average salary of male and female employees?");
//		System.out.println("============================================================");
//		Map<String, Double> avgSalaryMaleAndFemale =
//				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
//		Set<Entry<String, Double>> entrySet5 = avgSalaryMaleAndFemale.entrySet();
//		for(Entry<String, Double> entry : entrySet5) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//		System.out.println("----------------------------------------------------------------------------------------------"); 
//		System.out.println("12. List down the names of all employees in each department?");
//		System.out.println("============================================================");
//        Map<String,List<Employee>> listAllEmployee =
//        		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        Set<Entry<String,List<Employee>>> listEmployee =listAllEmployee.entrySet();
//        for(Entry<String,List<Employee>> entry:listEmployee) {
//        	System.out.println("------------------------");
//        	System.out.println(entry.getKey());
//        	System.out.println("------------------------");
//        	List<Employee> emp =entry.getValue();
//        	for(Employee em:emp) {
//        		System.out.println(em.getName());
//        	}
//        }
//		System.out.println("----------------------------------------------------------------------------------------------"); 
//		System.out.println("13. What is the average salary and total salary of the whole organization?");
//		System.out.println("==========================================================================");
//		DoubleSummaryStatistics employeeSumStatic =
//				employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//		System.out.println(employeeSumStatic.getAverage());
//		System.out.println(employeeSumStatic.getSum());
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
//		System.out.println("=================================================================================================================");
//		Map<Boolean, List<Employee>> empAgeLessThan25=
//				employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
//		Set<Entry<Boolean, List<Employee>>> empAgeLess25 =empAgeLessThan25.entrySet();
//		for(Entry<Boolean, List<Employee>> empAge:empAgeLess25) {
//			System.out.println("---------------------------------------------");
//			if(empAge.getKey()) {
//				System.out.println("Employees older than 25 years :");
//			}else {
//				System.out.println("Employees younger than or equal to 25 years :");
//			}
//			System.out.println("--------------------------------------------------");
//			List<Employee> emp =empAge.getValue();
//			for(Employee e:emp) {
//				System.out.println(e.getName());
//			}
//		}
//		System.out.println("----------------------------------------------------------------------------------------------");
//		System.out.println("15. Who is the oldest employee in the organization? What is his age and which department he belongs to?");
//		System.out.println("=======================================================================================================");
//		Optional<Employee> oldestEmployeeWrap =
//				employeeList.stream().max(Comparator.comparing(Employee::getAge));
//		Employee oldestEmployee =oldestEmployeeWrap.get();
//		System.out.println("Name : "+oldestEmployee.getName());
//		System.out.println("Age : "+oldestEmployee.getAge());
//		System.out.println("Dept : "+oldestEmployee.getDepartment());
//		System.out.println("------------------------END-------------------------------------------------------------------");

	}

}
