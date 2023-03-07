package com.numbers;
class B26
{
       //Find out given num is a prime 0r not
	public static void main(String[] args) 
	{
		int i = 10;
		boolean isPrime = true;
		for(int j = 2; j <= i /2; j++)
		{
			if(i % j == 0)
			{
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime);
	}
}

//false