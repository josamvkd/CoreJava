package com.java8new;

interface A{
	public void show();
}
/**
 * Method 1
 * 
 */
/*
 * class B implements A{
 * 
 * public void show() { System.out.println("Hello!!!"); } }
 */

public class LamdaDemo {

	public static void main(String[] args) {
		/**
		 * Method 1
		 * 
		 */
		/*
		 * A obj =new B(); obj.show();
		 */
		
		/**
		 * Method 2
		 * 
		 */
		/*
		 * A obj = new A() { public void show() { System.out.println("Second Hello!!!");
		 * } }; obj.show();
		 */
		
		/**
		 * Method 3 ie, method 2 modified
		 */
		
		/*
		 * A obj = () -> { System.out.println("Third Hello!!!"); }; obj.show();
		 */
		
		/**
		 * Method 4 ie, 3 modified
		 */
		
		A obj = () -> System.out.println("Fourth Hello!!!");
 	    obj.show();
	}

}
