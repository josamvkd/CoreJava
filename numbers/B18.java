package com.numbers;
class B18
{

	//sum of the digits in a given number
	public static void main(String[] args) 
	{
		int num =23467;
		int sum = 0;
		while(num != 0)
		{
			sum = sum + (num % 10);//7 // 7+6=13 // 13+4=17 // 17+3=20 //20+2 = 22
			num = num / 10; //2346 //234 // 23 // 2
		}
		System.out.println(sum);//22
	}
}