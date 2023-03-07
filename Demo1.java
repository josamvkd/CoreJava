package com.demo;

public class Demo1 {
	int i,j;
	
	public void sum() {
		i=30;
		j=20;
		System.out.println("The sum of "+i+", "+j+" is: "+(i+j));
		System.out.println("(i*j)"+i+", "+j+" is: "+(i*j));
		System.out.println("(i-j)"+i+", "+j+" is: "+(i-j));
	}

	public static void main(String[] args) {
		Demo1 obj =new Demo1();
		obj.sum();
	}

}
