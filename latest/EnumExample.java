package com.latest;

enum Common{
	LOW,
	MEDIUM,
	HIGH
}

public class EnumExample {

	public static void main(String[] args) {
		Common obj =Common.HIGH;
		
		switch(obj) {
		case LOW:System.out.println("Battery Charge low");
		break;
		case MEDIUM:System.out.println("Battery Charge  medium");
		break;
		case HIGH:System.out.println("Battery Charge High");
		break;
		}
		
	}

}
