package com.numbers;
/*
6=1+2+3
28=1+2+4+7+14
*/
class B39
{ 
	public static void main(String[] args) 
	{
		//int i =28;
		int i = 35;
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
			System.out.println(i + "is a perfect number" );
		   }
		   else
		  {
			System.out.println(i + "is not a perfect number" );
		  }
	}
}