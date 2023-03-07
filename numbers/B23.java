package com.numbers;
class B23
{
       //printing 7 multiples from 95 to 21
	public static void main(String[] args) 
	{
		int num1 =95;
		int num2 =21;

		for(int i = num1; i >= num2; i--) 
		{
			if(i % 7 == 0)
			{
		         System.out.println(i); 
			}
		}
	}
}


/*

91
84
77
70
63
56
49
42
35
28
21
*/
