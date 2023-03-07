package com.latest;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		int i=8;
		int j=9;
		try {
			int k= i/j;
			if(k==0) {
				throw new JoException("Jo Exception");
			}
			
			System.out.println("Val :"+k);
		}catch(JoException e) {
			System.out.println("Error occured :"+e.getMessage());
		}
		

	}

}
