package com.joesam;
class AB{
    public void show() {
		System.out.println("AB");
	}
}
class AC{
	public void show() {
		System.out.println("AC");
	}
}

class AD extends AB//AB,AC 
{
	
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		AD obj =new AD();
		obj.show();

	}

}
