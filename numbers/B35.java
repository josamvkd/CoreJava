package com.numbers;
class B35
{ 
	public static void main(String[] args) 
	{
		int num = 29892;
		int i = num;  
		int revNum = 0;
		while(i != 0)
		{
			revNum =  revNum * 10 + (i % 10);
			i  = i / 10;
		 }
      	 if (num == revNum)
		 {

		     System.out.println(" pailindrome");
		 }
		 else
	     {
	     	 System.out.println(" not a pailindrome");
		  }
		}
	}

	//pailindrome  // 121, 343, 56765