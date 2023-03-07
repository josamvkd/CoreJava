package com.latest;
//Runtime Exception
public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int i[] = new int[4];
			i[3] = 5;
			System.out.println(i[3]);

			int k = 10;
			int j = 1;
			int l = k / j;
			System.out.println("k value is " + l);
			
			int m[]=null;
			System.out.println(m[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}finally {
			System.out.println("Rest of the code...");
		}
		
	}

}
