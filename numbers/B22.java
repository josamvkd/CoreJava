package com.numbers;
class B22
{
       //printing 5 multiples from one num to another num
	public static void main(String[] args) 
	{
		int num1 =31;
		int num2 =65;

		for(int i = num1; i <= num2; i++) // (31; 31<=65; incremnt every time
		{
			if(i % 5 == 0)
			{
		         System.out.println(i); 
			}
		}
	}
}

/*

35
40
45
50
55
60
65

*/