package com.numbers;
class B28
{
	public static void main(String[] args) 
	{
		int i = 55; //79
		boolean b1 = true;
		for(int j = 2; j <= (i /2); j++)
		{
			if(i % j == 0)
			{
				b1 = false;
				break;
			}
		}
        if(b1)
        {  
			 System.out.println(i + " is a prime");
         }
		 else
		{
			 System.out.println(i + " is not a prime");
		}
	}
}

//55 is not a prime
//79 thn 79 is a prime