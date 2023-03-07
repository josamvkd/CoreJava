package com.java8new;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeApiDemo {

	public static void main(String[] args) {
 /**
  * Local Date
  */
		// LocalDate d = LocalDate.now(); // Current Date
		//LocalDate d = LocalDate.of(1990, 10, 19);
		//OR
		LocalDate d = LocalDate.of(1990, Month.OCTOBER, 19);
		System.out.println(d);
	System.out.println("----------------------");	
	/**
	 * 	Local Time
	 */
	LocalTime t =LocalTime.now();
	System.out.println(t);
	System.out.println("----------------------");	
	/**
	 * Zone 
	 */
	
	for(String s :ZoneId.getAvailableZoneIds()) {
		System.out.println(s);
	}
	
	System.out.println("------------------------");
	LocalTime zt =LocalTime.now(ZoneId.of("Asia/Tokyo"));
	System.out.println(zt);
	System.out.println("------------------------");
	Instant i =Instant.now();
	System.out.println(i);
	}

}
