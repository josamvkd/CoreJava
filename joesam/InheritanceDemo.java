package com.joesam;

class Parent{
	public void PProperties() {
		System.out.println("Parent properties");
	}
}
class Child extends Parent{
	public void CProperties() {
		System.out.println("Child properties");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Child obj =new Child();
		obj.CProperties();
		obj.PProperties();
		

	}

}
