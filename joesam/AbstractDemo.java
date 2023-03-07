package com.joesam;

/*In summary, an abstract class is a class that cannot be instantiated directly
 * but provides a common interface or functionality for its derived classes.
 * It contains abstract and non-abstract methods, instance variables, constructors,
 * and static methods.*/

//When the class is abstract not able to create an object
//Abstract class can have abstract method and normal method
abstract class Human
{
	public abstract void display(); 
	
	public void show() {
		
	}
}
class Man extends Human //Concrete class
{

	@Override
	public void display() {
		
	}
	
}


public class AbstractDemo {

	public static void main(String[] args) {

		//Human obj =new Human();
		Human obj =new Man();
	}

}
