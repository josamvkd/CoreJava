package com.joesam;

public class Constructor {
	int num1;
	int num2;
	int num3;
	
	public Constructor() {
		num1 =5;
		num2 =6;
		num3 =num1+num2;
	}
	
	public Constructor(int n) {
		num1 =n;
	}
	

	public static void main(String[] args) {
		
		Constructor obj =new Constructor(8);
		//System.out.println(obj.num1+" + "+obj.num2+" = "+obj.num3);
		System.out.println(obj.num1);

	}

}
