package com.numbers;
class B13
{
	public static void main(String[] args) 
	{

		//47
		int num = 47;
		System.out.println(num);
		int num1 = num % 10;//7
		num1 = num1 * 10;//70
		num = num / 10; //4
		num = num1 + num;
		System.out.println(num);
	}
}

/*
47
74
*/