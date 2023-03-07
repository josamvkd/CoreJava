package com.joesam;

public class Array2DDemo {

	public static void main(String[] args) {
		//int a[] = {1,2,3,4};
		//int b[] = {5,6,7,8};
		//int c[] = {9,5,2,1};
		
		
		int d[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,5,2,1}
		};
		//System.out.println(d[0][0]);
		
		for(int i=0;i<3;i++) // count the number of rows
		{
			for(int j=0;j<4;j++) { // count the number of columns
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}

	}

}
