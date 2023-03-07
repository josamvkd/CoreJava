package com.numbers;
class B27
{
	public static void main(String[] args) 
	{
		int i = 23;
		boolean b1 = true;
		for(int j = 2; j <= i /2; j++)
		{
			if(i % j == 0)
			{
				b1 = false;
				break;
			}
		}

		System.out.println(b1);
	}
}