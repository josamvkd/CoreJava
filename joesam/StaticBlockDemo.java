package com.joesam;
class StaticBlock{
	int eid;
	int salary;
	static String ceo;
	
	static { // Execute when you load a class
		 ceo="Jomon";
		 System.out.println("In static");
	}
	public StaticBlock() { // execute when you create an object 
		eid =1000;
		salary=25000;
		System.out.println("In Constructor");
	}
	
	public void show() {
		System.out.println("EID :"+eid+" Salary :"+salary+" CEO :"+ceo);
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		StaticBlock obj =new StaticBlock();
		StaticBlock obj1 =new StaticBlock();
		obj.show();
		obj1.show();
	}

}
