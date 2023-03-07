package com.joesam;

/*
 * In summary, anonymous classes are local classes without a name
 * that can be used to provide a quick implementation of an interface or class.
 * They are defined and instantiated at the same time and can have constructors,
 * instance variables, and methods.
 */

interface AirBus
{
	void takeOff();
}

public class AnnonimousClassDemo {

	public static void main(String[] args) {

		AirBus obj =new AirBus() {
			public void takeOff() {
				System.out.println("AirBuss TakeOff");
			}
		};
		obj.takeOff();
	}

}
