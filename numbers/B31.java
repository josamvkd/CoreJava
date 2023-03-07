package com.numbers;
class B31
{      //find out prime number between 100 to 50 or two given numbers //from bigger no. to smaller num.
		public static void main(String[] args) 
	{
		int start = 100, end = 50;
        boolean b1;
		for(int i = start; i>= end; i--) 
		{
			b1= true;
		for(int j = 2; j <= (i/2); j++) 
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

97,
89,
83,
79,
73,
71,
67,
61,
59,
53,
*/