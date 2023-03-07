package com.numbers;
class B33
{      //find out prime number raising order
		public static void main(String[] args) 
	{
        int i = 24;
		int digit2 = i % 10;
		int digit1 = (i / 10) % 10;  
		System.out.println(digit1 + ", " + digit2);
	     if(digit1 < digit2)
		{
		     System.out.println(i + " in the raising order");
		}
		else
	       {
			 System.out.println(i + " not in the raising order");
			}
		}
	}

	/*

	2, 4
24 in the raising order

*/