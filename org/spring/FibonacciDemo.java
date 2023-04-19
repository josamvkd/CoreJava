package org.spring;

public class FibonacciDemo {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=10;
		
		System.out.print(n1+" "+n2);// print 0 and 1
		
		for(i=2;i<count;i++) {// start from 2 because 0 and 1 already printed
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
