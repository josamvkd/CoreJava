package com.java8new;

interface Phone{
	
	void call();
	default void message() {
		System.out.println("Message sent");
	}
	
	static void staticMethod() {
		System.out.println("Static Method");
	}
}

class AndroidPhone implements Phone {

	@Override
	public void call() {
		System.out.println("Incomming Call");
	}
}

public class DemoInterface {

	public static void main(String[] args) {
		Phone obj =new AndroidPhone();
		obj.call();
		obj.message();
		Phone.staticMethod();
	}

}
