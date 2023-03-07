package com.latest;

class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class SynchronzationDemo {

	public static void main(String[] args) throws Exception{
		
		Counter co =new Counter();
		//co.increment();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() 
			{
				for (int i=1;i<=1000; i++) {
					co.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() 
			{
				for (int i=1;i<=1000; i++) {
					co.increment();
				}
			}
		});
		  
		  t1.start();
		  t2.start();
		  
		  t1.join();
		  t2.join();
		
		System.out.println("Count "+co.count);
	}

}
