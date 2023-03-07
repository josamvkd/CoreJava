package com.joesam;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
     
		//pre increment and post increment
		
		int m =4;
		int n =5;
		int a =4;
		int b =5;
		int k =2;
		int j =3;
		//pre increment
		
		m = ++n;
		System.out.println("m->"+m);//6
		System.out.println("n->"+n);//6
		// post increment
		a = b++;
		System.out.println("a->"+a);//5
		System.out.println("b->"+b);//6
		
		
	}
}
