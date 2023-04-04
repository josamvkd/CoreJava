package com.repeat;

public class FinalizeDemo {

	public static void main(String[] args) {
		
		FinalizeDemo obj =new FinalizeDemo();
		System.out.println("Hashcode is: " +obj.hashCode());
		obj=null;
		// calling the garbage collector using gc()   
		System.gc();
		System.out.println("End of the garbage collection");    
	}
	// defining the finalize method   
	protected void finalize(){
		System.out.println("Called the finalize() method");
	}

}
