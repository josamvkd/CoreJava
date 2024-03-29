package com.repeat;

import java.util.Scanner;

class MyRegex{

	//0-199      [01]?\\d{1,2}
	//200-249    2[0-4]\\d
	//250-255    25[0-5]
	String num="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern= num+"."+num+"."+num+"."+num;
}

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("IP : ");
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
//[01]
    }
}
