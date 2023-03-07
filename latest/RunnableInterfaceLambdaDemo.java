package com.latest;

public class RunnableInterfaceLambdaDemo {

	public static void main(String[] args) {

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

		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
	}

}
