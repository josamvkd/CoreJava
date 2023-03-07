package com.numbers;
class B14
{
	public static void main(String[] args) 
	{

		int num = 28;
		System.out.println(num);        // 28

		int lastDigit = num % 10;// 8
		lastDigit = lastDigit * 10; // 80
		num = num / 10; //2
		num = lastDigit + num;           //82
		System.out.println(num);
	}
}