package com.latest;

class SingleIntance{

// Object private static
// private Constructor
// public static method return type as class name	
	
private static SingleIntance obj =new SingleIntance(); 

private SingleIntance(){}

public static SingleIntance getInstance() {
	return obj;
}
}

public class SingletonDemo{	
	public static void main(String[] args) {
		SingleIntance obj =SingleIntance.getInstance();
		
	}

}
