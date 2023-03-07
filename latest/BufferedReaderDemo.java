package com.latest;

import java.io.*;

public class BufferedReaderDemo{
	
	public static void main(String[] args)throws Exception{
	
	InputStreamReader ip =new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(ip);
	System.out.println("Pls Enter String :");
	String input =br.readLine();
	System.out.println("Ip is :"+input);
	}
}