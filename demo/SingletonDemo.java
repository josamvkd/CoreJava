package com.demo;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}

class Singleton{
	
	public static Singleton obj = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return obj;
	}
	
}
