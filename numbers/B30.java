package com.numbers;
class B30
{      //find out all prime number between 25 to 40 or two given numbers
		public static void main(String[] args) 
	{
		int start = 25, end = 40;
        boolean b1;
		for(int i = start; i<= end; i++) 
		{
			b1= true;
		for(int j = 2; j<= (i/2); j++) 
		{
			if(i % j == 0)
			{  
				b1 = false;
				break;
			}
		}
		if(b1)
			{
		         System.out.println(i + ", ");
			}
		}
	}
}

/*
29,
31,
37,
*/