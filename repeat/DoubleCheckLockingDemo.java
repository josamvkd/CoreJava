package com.repeat;


class SingletonDoubleCheckDemo{
	
	private static SingletonDoubleCheckDemo instance;
	
	private SingletonDoubleCheckDemo() {}
	
	public static SingletonDoubleCheckDemo getInstance(){
		if(instance==null) {
			synchronized(SingletonDoubleCheckDemo.class) {
				if(instance==null) {
					instance =new SingletonDoubleCheckDemo();
				}
			}
			
		}
		return instance;
	}
}

public class DoubleCheckLockingDemo {

	public static void main(String[] args) {
		
		SingletonDoubleCheckDemo object1=SingletonDoubleCheckDemo.getInstance();
		System.out.println(object1);
		SingletonDoubleCheckDemo object2=SingletonDoubleCheckDemo.getInstance();
		System.out.println(object2);
	}

}
