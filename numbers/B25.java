package com.numbers;
class B25
{

	public static void main(String[] args) 
	{
		int num =23904561;
		int i = num;
		int revNum = 0;

		while(i != 0)
		{
			revNum = revNum * 10 + (i % 10); //0*10+1=1 //10+6=16// .....16*10+5=165
			i = i / 10;//2390456//239045//23904
		}

		System.out.println("num:"+ revNum);
		System.out.println("reversed num:"+ revNum);
	}
}

/*
num:16540932
reversed num:16540932

*/