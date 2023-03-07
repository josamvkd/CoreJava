package com.latest;

class Apple extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Apple");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class Samsung extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Samsung");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Apple obj1 =new Apple();
		Samsung obj2 =new Samsung();
		
		obj1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		obj2.start();
		
		
	}

}
