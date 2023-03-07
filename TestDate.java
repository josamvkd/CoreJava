package com.demo;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		/*
		 * String str_date = "11-June-07"; DateFormat formatter = new
		 * SimpleDateFormat("DDMMYY"); //Date date = formatter.parse(str_date);
		 * //System.out.println(date);
		 * 
		 * // Format formatter1 = new SimpleDateFormat("DDMMYY"); String s =
		 * formatter.format(str_date); System.out.println(s);
		 */
		  
		  DateFormat outputFormat = new SimpleDateFormat("ddMMYY");
		  DateFormat inputFormat = new SimpleDateFormat("dd-MMM-yyyy");

		  String inputText = "12-Mar-2022";
		  //System.out.println(inputText);
		  Date date = inputFormat.parse(inputText);
		 // System.out.println(date);
		  String outputText = outputFormat.format(date);
		 // System.out.println(outputText);
		  
		  
		  
	}
}
