package com.numbers;
/*
find out first 3 perfect numbers
*/
class B40
{ 
	public static void main(String[] args) 
	{
		int i = 11;
		int count = 0;
		while(count < 3)
		{
		int sum = 0;
	    for(int j= 1; j <=( i / 2 ); j++)
			{
				if(i % j == 0)
				{
					sum = sum + j;
				}
			}
		
		     if (i == sum)
		  {
			System.out.println(i);
			count ++;
		   }
		    i ++;
		  }
	}
}

/*
28
496
8128
*/