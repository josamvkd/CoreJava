package com.java8new;

interface I{
	public void show( int i);
}


public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
        I obj;
        /**
         * Method 1
         */
		/*
		 * obj = new I() { public void show( int i) {
		 * System.out.println("The SL No is : "+i); } };
		 * 
		 * obj.show(7);
		 */
        
        /**
         * Method 2
         */
        
        obj = (i) -> System.out.println("The SL No is : "+i);
        obj.show(7);
	}

}
