package com.numbers;
class B32
{      //find out prime number which is immediately after 10 multiple
		public static void main(String[] args) 
	{
        boolean b1;
		for(int i = 10; i<= 200; i++) 
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
		if(b1 && ((i - 1) % 10 == 0))
     
			{
		         System.out.println(i);
			}
		}
	}
}

/*
11
31
41
61
71
101
131
151
181
191

*/