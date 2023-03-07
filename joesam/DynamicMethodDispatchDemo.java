package com.joesam;

class X
{
	public void show() 
	{
		System.out.println("in X");
	}
}
class Y extends X
{
	public void show() 
	{
		System.out.println("in Y");
	}
	
}
class Z extends X
{
	public void show() 
	{
		System.out.println("in Z");
	}
}


public class DynamicMethodDispatchDemo {

	public static void main(String[] args) {

		X obj =new Y(); //runtime polymorphism
		obj.show();
		
		obj =new Z();
		obj.show();// Dynamic method dispatch
	}

}
