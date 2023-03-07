package com.latest;
// Runtime Exception
public class TryCatchDemo {

	public static void main(String[] args) {
		try {
			int i = 10;
			int j = 0;
			int k = i / j;
			System.out.println("k value is " + k);
		} catch (Exception e) {
			System.out.println("Exception occured");
		} finally {
			System.out.println("Running remaining code*****");
		}
	}

}
