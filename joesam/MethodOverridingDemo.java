package com.joesam;

class A{
	public void show() {
		System.out.println("Class A");
	}
}
class B extends A{
	
	@Override
	public void show() {
		System.out.println("Class B");
	}
	
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		B b =new B();
		b.show();

	}

}
