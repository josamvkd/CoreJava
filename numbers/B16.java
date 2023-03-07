package com.numbers;
class B16
{
	public static void main(String[] args) 
	{
		int num = 34;
		int revNum = 0;
		int lastDigit;
		while(num != 0)
		{
			lastDigit = num % 10; //4 //3
			revNum =  revNum * 10 + lastDigit; //4 // 4*10+3
			num = num / 10; // 3
		}
		System.out.println(revNum);  //43
	}
}