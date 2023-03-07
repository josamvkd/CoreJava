package com.latest;
//Runtime Exception
public class SingleCatchBlock {

	public static void main(String[] args) {
		try {
			int i[] = new int[4];
			i[3] = 5;
			System.out.println(i[3]);

			int k = 10;
			int j = 1;
			int l = k / j;
			System.out.println("k value is " + l);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Rest of the code...");
		}

	}

}
