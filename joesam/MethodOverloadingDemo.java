package com.joesam;

class MODemo{
	
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	
	public void add(double i,double j) {
		System.out.println(i+j);
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		MODemo obj =new MODemo();
		obj.add(5, 3);
		obj.add(5, 3, 6);
		obj.add(5.6, 3.2);
	}

}
