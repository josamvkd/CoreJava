package org.spring;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str1="Remove white spaces";
		
		str1 = str1.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
