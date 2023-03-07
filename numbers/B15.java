package com.numbers;
class B15
{
	public static void main(String[] args) 
	{
        //456789
		int num = 456758;
		int count = 0;
		while(num != 0)
		{
			count++;
			num = num / 10;
		}
		System.out.println(count);        // 6.., counting digits in a given number 
	}
}

/*
6
*/