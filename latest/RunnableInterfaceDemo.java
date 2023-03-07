package com.latest;

class Audi implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Audi");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class BMW implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("BMW");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

public class RunnableInterfaceDemo {

	public static void main(String[] args) {
		Runnable obj1 =new Audi();
		Runnable obj2 =new BMW();
		
		Thread t1 =new Thread(obj1);
		Thread t2 =new Thread(obj2);
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		
	}

}
