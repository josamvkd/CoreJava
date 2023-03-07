package com.numbers;
class B29
{      //print initial 10 prime number
		public static void main(String[] args) 
	{
		int start = 2;
		int count = 0;
        boolean b1;
		while(count < 10)
		{
			b1= true;
		for(int j = 2; j<= (start/2); j++) 
		{
			if(start% j == 0)
			{  
				b1 = false;
				break;
			}
		}
		if(b1)
			{
		         System.out.println(start + ",");
				 count ++;
			}
			start ++;
		}
	}
}

/*
2,
3,
5,
7,
11,
13,
17,
19,
23,
29,

*/