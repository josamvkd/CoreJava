package com.joesam;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try {
			int i =10;
			int j =0;
			int k =i/j;
			System.out.println("Output :"+k);
		}catch(ArithmeticException e) {
			System.out.println("Error ");
		}
		finally {
			System.out.println("*******Rest of the code********");
		}

	}

}
