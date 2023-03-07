package com.numbers;
class B24
{

	//reverse a number
	public static void main(String[] args) 
	{
		int num =2034;
		int revNum = 0;
		int i = num;

		while(i != 0)
		{
			revNum = revNum * 10 + (i % 10); // 0 *10+4=4//  4*10+3=43 //  43*10+0=4302
			i = i / 10;//203// 20//0 
		}

		System.out.println(num + ":" + revNum);//2034:4302
	}
}