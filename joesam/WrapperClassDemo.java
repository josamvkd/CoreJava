package com.joesam;

public class WrapperClassDemo {

	public static void main(String[] args) {

		int i =5;
		Integer k =new Integer(i); // Boxing or Wrapping
		int j=k.intValue();// Unboxing
		
		Integer value =i; //autoboxing
		int b=value;//autounboxing
	}

}
