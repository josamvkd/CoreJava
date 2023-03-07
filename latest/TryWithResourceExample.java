package com.latest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResourceExample {

	public static void main(String[] args) throws Exception {
		int input =0;
		try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
		System.out.println("Pls Enter Integer :");
		input = Integer.parseInt(br.readLine());
		}
		System.out.println("Ip is :"+input);

	}

}
