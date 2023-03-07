package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) throws ParseException {
		 String sDate1="31-Mar-2021";  
		    Date date1=new SimpleDateFormat("DD/MM/YY").parse(sDate1);  
		    System.out.println(sDate1+"\t"+date1);  
	}

}
