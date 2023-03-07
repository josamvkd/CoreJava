package com.numbers;
/*
153 = 1*1*1 + 5*5*5 + 3*3*3 =153
371 = 3*3*3 + 7*7*7 + 1*1*1 = 371

*/

class B37
{ 
	public static void main(String[] args) 
	{
		//int num = 153;
		int num = 153;
		int i = num, j =num;
		//total number of digits
		int digitsCount = 0;
		while(i != 0)
		{
			digitsCount ++;
			i = i / 10;
		}

		int sum = 0;
		int digit, digitPower;
		while(j != 0)
		{
			digit = j % 10;
			digitPower = 1;
			for(int k = 1; k <= digitsCount; k++)
			{
				digitPower = digitPower * digit;
			}
	         sum = sum + digitPower;
			j = j / 10;
		}
		if (num == sum)
		{
			System.out.println("armstrong ");
		}
		else
		{
			System.out.println("not an armstrong"); //armstrong
		}
	}
}