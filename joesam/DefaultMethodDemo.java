package com.joesam;

interface Demo 
{
	void abc();
	default void show() {
		System.out.println("Hello");
	}
}

class Jo implements Demo{

	@Override
	public void abc() {
		System.out.println("Abc");
	}
	
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		Demo obj =new Jo();
		obj.show();
		obj.abc();

	}

}
