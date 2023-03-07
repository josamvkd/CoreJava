package com.joesam;

interface Geo
{
	int num=10; // variable inside interface is default final
	static void show() {
		System.out.println("Helllo");
	}
}

public class StaticMethodJava8Demo {

	public static void main(String[] args) {
		Geo.show();
	}
}
