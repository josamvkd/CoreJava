package com.joesam;

public class EnhancedForLoop2DDemo {

	public static void main(String[] args) {
		int d[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,5,2,1}
		};
		
		for(int i[]:d) {
			for(int k:i) {
				System.out.print(" "+k);
			}
			System.out.println();
		}

	}

}
