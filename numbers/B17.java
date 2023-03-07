package com.numbers;
class B17
{
	public static void main(String[] args) 
	{
		int num = 3412;
        System.out.println(num);

		int revNum = 0;
		int lastDigit = num % 10;//2
		revNum = revNum * 10 + lastDigit; //2

        num = num / 10; //341
		lastDigit = num % 10;  //1
		revNum =  revNum * 10 + lastDigit; //2 *10+1=21

        num = num / 10;  //34
		lastDigit = num % 10;  // 4
		revNum =  revNum * 10 + lastDigit; // 21*10+4=210+4=214
 
        num = num / 10; //3
		lastDigit = num % 10; //3
		revNum =  revNum * 10 + lastDigit;// 2140+3=2143

		System.out.println(revNum); //2143
	}
}