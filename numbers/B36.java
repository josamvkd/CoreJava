package com.numbers;
/*

int i = 9999;
sum of the digits of 9999 = 36
summ of the digits of 36 = 9


int i = 869
sum of the digits of 869 = 23
sum of the digitd of 23 = 5

*/
class B36
{ 
	public static void main(String[] args) 
	{
		long num =99999999999999999L; 
		long i = num; //9999
		long sum = 0;
		while((i / 10) != 0)
		{
			System.out.println(i); //9999
			while(i != 0)
			{
			sum = sum + (i % 10); //9// 9+9=18//18+9=27//27+9=36
			i = i / 10; //999
		    }
	     System.out.println(":"  + sum);
		 i = sum;
		 sum = 0;
		 }
	      System.out.println(i);
}
}

/*
 /////99999999999999999L
99999999999999999
:153
153
:9
9


9999
:36
36
:9
9
*/