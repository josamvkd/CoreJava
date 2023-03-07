package com.joesam;

class AA{
	public AA() {
		System.out.println("in AA");
	}
	public AA(int i) {
		System.out.println("in AA int");
	}
}
class BB extends AA{
	public BB() {
		super();
		System.out.println("in BB");
	}
	public BB(int j) {
		super(j);
		System.out.println("in BB int");
	}
}


public class SuperDemo {

	public static void main(String[] args) {
		//AA obj =new AA();
		BB obj1 =new BB(2);
	}

}
