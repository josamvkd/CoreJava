package com.latest;

public class ThreadNameAndPriorityDemo{

	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Car");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Jeep");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		});
		
		t1.setName("Thread1");
		t2.setName("Thread2"
				+ "");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println("Byeeeeeee");

	}

}
