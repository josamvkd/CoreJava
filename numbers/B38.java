package com.numbers;
/*
print armstrongs numbers 10 

*/
class B38
{ 
	public static void main(String[] args) 
	{
		int num = 11;
		int count = 0;
		while(count < 10)
		{
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

			System.out.println(num);
			count ++;
		}
         num++;
		}
	}
}

/*
153
370
371
407
1634
8208
9474
54748
92727
93084
*/