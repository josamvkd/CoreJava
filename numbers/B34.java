package com.numbers;
class B34
{ 
		public static void main(String[] args) 
	{
		boolean isRaising = true;
		int num =23687;//79 thn raising
        int i = num;
		int prevDigit = i % 10;//7 8
		i = i / 10;  //2368 
		int currentDigit;
		while(i != 0)
		{
			currentDigit = i %10;
			if(currentDigit > prevDigit)
			{
              isRaising = false;
			  break;
			}
              prevDigit = currentDigit;
			  i = i /10;//236
		 }
		 if (isRaising)
		 {

		     System.out.println(i + " in the raising order");
		 }
		 else
	     {
	     	 System.out.println(i + " not in the raising order");
		  }
		}
	}

	//2368 not in the raising order
