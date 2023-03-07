package com.joesam;

class Constructor1{
	int id;
	int age;
	String name;
	
	public Constructor1() {
		id =0;
		age=0;
		name="Nothing";
	}
	public Constructor1(int i) {
		id =i;
		age=0;
		name="Nothing";
	}
	public Constructor1(int i,int j) {
		id =i;
		age=j;
		name="Nothing";
	}
	public Constructor1(int i,int j, String k) {
		id =i;
		age=j;
		name=k;
	}
	
}



public class ConstructorOverloading {

	public static void main(String[] args) {
		Constructor1 obj =new Constructor1(101,32,"Jomon");
		System.out.println(obj.id);
		System.out.println(obj.age);
		System.out.println(obj.name);

	}

}
