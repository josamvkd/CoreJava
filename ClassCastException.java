package com.demo;

public class ClassCastException {

	public static void main(String[] args) {
		System.out.println("Main Begin:");
		/*
		 * Up casting is possible
		 * String str =new String(); Object obj =(Object) str;
		 */
		/* Down cast is not possible which will throw exception */
		Object obj =new Object();
		String s = (String) obj;
		System.out.println("Main End:");
	}

}
