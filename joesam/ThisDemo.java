package com.joesam;

class This{
	int num1;
	int num2;
	
	public This(int num1,int num2) {
		this.num1 = num1; // current object
		this.num2 = num2;
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		This obj =new This(8, 6);
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
