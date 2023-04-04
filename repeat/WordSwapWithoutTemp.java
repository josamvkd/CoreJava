package com.repeat;

public class WordSwapWithoutTemp {

	public static void main(String[] args) {
		String a ="Jomon";
		String b ="Samuel";
		System.out.println("Before swaping :"+a+" "+b);
		System.out.println("------------------------");
		a =a+b; 
		System.out.println(a);//JomonSamuel
		b =a.substring(0,a.length()-b.length()); //JomonSamuel(10) - Samuel(5)
		System.out.println(b);//Jomon
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println("------------------------");
		System.out.println("After swaping :"+a+" "+b);
	   
	
		
	}

}
