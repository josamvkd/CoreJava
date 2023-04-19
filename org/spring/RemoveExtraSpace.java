package org.spring;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		String mytext = " hello     there   we    go";
		
		mytext = mytext.replaceAll("( )+"," ");
		System.out.println(mytext.trim());
	}

}
