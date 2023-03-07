package com.latest;

import java.io.*;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br =null;
		try {
			br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Pls Enter String :");
			String input =br.readLine();
			System.out.println("Ip is :"+input);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}finally {
			br.close();
			System.out.println("Closed");
		}
		

	}

}
