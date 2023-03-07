package com.joesam;

@FunctionalInterface
interface MyInterface
{
	
	void abc(); // Only one abstract method
	default void bbc() {
		System.out.println("Hiiii");
	}
}

class Bibit implements MyInterface{
	public void abc() {
		System.out.println("Abc");
	}
}

public class FunctionalInterfaceJava8Demo {

	public static void main(String[] args) {
		Bibit obj=new Bibit();
		obj.bbc();
		obj.abc();

	}

}
