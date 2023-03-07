package com.joesam;
// No need of Object to call static 
class Employee{
	int eid;
	int salary;
	static String ceo="Anu";
	
	public void show() {
		System.out.println("Eid :"+eid);
		System.out.println("Salary :"+salary);
		System.out.println("CEO :"+Employee.ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Employee jo =new Employee();
		jo.eid=101;
		jo.salary=13000;
		
		
		Employee an =new Employee();
		an.eid=102;
		an.salary=25000;
		
		jo.show();
		System.out.println("-------------------");
		an.show();
	}

}
