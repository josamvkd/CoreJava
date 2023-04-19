package org.spring;

public class StringReverse {

	public static void main(String[] args) {
		String str ="Relaxing Piano Music";
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--) {
			revStr = revStr+str.charAt(i);
		}
		System.out.println(str);
		System.out.println();
		System.out.println(revStr);
	}

}
