package com.repeat;

class MySingleton{
	int i=100;
	int j=200;
	int k=i+j;
	
	private static MySingleton obj =new MySingleton();
	
	private MySingleton() {	}

	public static MySingleton getObject() {
		return obj;
	}
}


public class SingletonDemo {

	public static void main(String[] args) {
		//MySingleton obj1 =new MySingleton();
		MySingleton obj1 = MySingleton.getObject();
		System.out.println(" I :"+obj1.i);
		System.out.println(" J :"+obj1.j);
		System.out.println(" I+J ="+obj1.k);
	}

}
