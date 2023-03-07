package com.joesam;

//Interface can have only abstract methods
//Cannot implements method inside interface
interface Student
{
	public abstract void dispay();
}

class School implements Student
{
	@Override
	public void dispay() {
		System.out.println("Display");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {

		//Student obj =new Student();
		Student obj = new School();
	}

}
