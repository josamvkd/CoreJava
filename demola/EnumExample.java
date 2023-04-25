package com.demola;
enum Contant{
	JAN,
	FEB,
	MAR,
	APRIL,
	MAY,
	JUNE,
	JULY,
	AUG,
	SEP,
	OCT,
	NOV,
	DEC
}


public class EnumExample {

	public static void main(String[] args) {
		Contant obj =Contant.JULY;
		
		switch(obj){
			case JAN:System.out.println("January");
			break;
			case FEB:System.out.println("February");
			break;
			case MAR:System.out.println("MARCH");
			break;
			case APRIL:System.out.println("April");
			break;
			case MAY:System.out.println("May");
			break;
			case JUNE:System.out.println("June");
			break;
			case JULY:System.out.println("July");
			break;
			case AUG:System.out.println("August");
			break;
			case SEP:System.out.println("September");
			break;
			case OCT:System.out.println("October");
			break;
			case NOV:System.out.println("November");
			break;
			case DEC:System.out.println("December");
			break;
		}
	}

}
