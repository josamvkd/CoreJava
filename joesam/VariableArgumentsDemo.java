package com.joesam;

class CalcD{
	
	/*
	 * public int add(int i, int j) { return i+j; }
	 */
	public int add(int...n ) {
		int sum=0;
		for(int i:n) {
			sum =sum+i;
		}
		return sum;
	}
	
}

public class VariableArgumentsDemo {

	public static void main(String[] args) {
		
		CalcD obj =new CalcD();
		System.out.println(obj.add(7,3,5,6,4,1));
	}

}
